package simulation;

import battle.Battle;
import characters.Character;
import dungeon.Dungeon;
import enemy.Enemy;
import floor.Floor;

public class Mediator {
    private Dungeon dungeon;
    private Character playerCharacter;

    public Mediator(Dungeon dungeon, Character playerCharacter) {
        this.dungeon = dungeon;
        this.playerCharacter = playerCharacter;
    }

    public void startSimulation() {
        int currentFloor = 1;

        while (currentFloor <= dungeon.getTotalFloors()) {
            int floor = dungeon.getFloor(currentFloor);
            System.out.println("\n=== Floor " + currentFloor + " ===");

            if (playerCharacter.getHealth() <= 0.15 * playerCharacter.getMaxHealth()) {
                System.out.println("Your health is critically low! Returning to the top floor...");
                playerCharacter.heal((int) playerCharacter.getMaxHealth());
                currentFloor = 1; // Go back to the top floor
            } else {
                dungeon.explore(playerCharacter);
                currentFloor++;

                if (currentFloor % 10 == 0) {
                    System.out.println("\n=== BOSS BATTLE ===");
                    Floor floor1 = null;
                    Enemy boss= floor1.getBoss();

                    Battle battle = new Battle(playerCharacter, boss);
                    battle.startBattle();

                    if (playerCharacter.isAlive()) {
                        System.out.println("Congratulations! You defeated the boss and won the game!");
                        break;
                    } else {
                        System.out.println("You were defeated by the boss. Game over!");
                        break;
                    }
                }
            }
        }

        System.out.println("\n=== GAME OVER ===");
    }
}
