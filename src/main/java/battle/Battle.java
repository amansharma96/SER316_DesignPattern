package battle;

import characters.Character;
import enemy.Enemy;

public class Battle {
    private Character player;
    private Enemy enemy;

    public Battle(Character player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void startBattle() {
        System.out.println("A battle has started!");
        System.out.println("Player: " + player.getName() + " vs Enemy: " + enemy.getName());

        while (player.isAlive() && enemy.isAlive()) {
            playerAttack();
            if (enemy.isAlive()) {
                enemyAttack();
            }
        }

        if (player.isAlive()) {
            System.out.println("Player wins the battle!");
        } else {
            System.out.println("Enemy wins the battle!");
        }
    }

    private void playerAttack() {
        int damage = player.calculateDamage();
        enemy.takeDamage(damage);
        System.out.println(player.getName() + " attacks " + enemy.getName() + " and deals " + damage + " damage.");
    }

    private void enemyAttack() {
        int damage = enemy.calculateDamage();
        player.takeDamage(damage);
        System.out.println(enemy.getName() + " attacks " + player.getName() + " and deals " + damage + " damage.");
    }
}
