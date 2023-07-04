package dungeon;

import battle.Battle;
import characters.Character;
import enemy.Enemy;
import enemy.MediumEnemy;
import enemy.SmallEnemy;
import floor.Floor;
import item.Item;
import shop.Shop;

import java.util.Random;

public class Dungeon {
    private int currentFloor;
    private int maxFloor;
    private Random random;

    public Dungeon(int maxFloor) {
        this.currentFloor = 1;
        this.maxFloor = maxFloor;
        this.random = new Random();
    }

    public void explore(Character playerCharacter) {
        // Generate a random encounter
        {
            Enemy enemy = new SmallEnemy();
            Battle battle = new Battle(playerCharacter, enemy);
            battle.startBattle();
        }

        // Check if a chest is found
        boolean hasChest = random.nextDouble() < 0.3; // 30% chance of finding a chest
        if (hasChest) {
            Item item = generateRandomItem();
            playerCharacter.addItemToInventory(item);
        }

        // Check if a shop is encountered
        boolean hasShop = random.nextDouble() < 0.2; // 20% chance of encountering a shop
        if (hasShop) {
            Shop shop = new Shop();
            shop.enterShop(playerCharacter);
        }

        // Handle player's progress through floors
        if (playerCharacter.getHealth() < 0.15) {
            returnToTopFloor(playerCharacter);
        } else {
            currentFloor++;
            if (currentFloor > maxFloor) {
                // Player has reached the maximum floor, end the game or provide rewards
                // ...
            }
        }
    }

    private Enemy generateRandomEnemy() {
        // Generate a random enemy based on the current floor or use predefined enemy types
        // ...
        return null; // Replace with the generated enemy
    }

    private Item generateRandomItem() {
        // Generate a random item based on the current floor or use predefined item types
        // ...
        return null; // Replace with the generated item
    }

    private void returnToTopFloor(Character playerCharacter) {
        // Reset player's health and mana to full when returning to the top floor
        playerCharacter.heal((int) playerCharacter.getMaxHealth());
        playerCharacter.restoreMana((Integer) playerCharacter.getMaxMana());
        currentFloor = 1;
    }

    public int getTotalFloors() {
        return 1;
    }

    public int getFloor(int currentFloor) {
        return this.currentFloor;
    }
}
