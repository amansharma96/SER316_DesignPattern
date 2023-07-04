package floor;

import characters.Character;
import enemy.Enemy;
import item.Item;
import shop.Shop;
import shop.ShopItem;
import battle.Battle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Floor {
    private int floorNumber;
    private List<Enemy> enemies;
    private Enemy boss;
    private Shop shop;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.enemies = new ArrayList<>();
        this.shop = new Shop();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setBoss(Enemy boss) {
        this.boss = boss;
    }

    public Enemy getBoss() {
        return boss;
    }

    public void explore(Character playerCharacter) {
        System.out.println("Exploring Floor " + floorNumber + "...");
        Battle battle = new Battle(playerCharacter, (Enemy) enemies);
        battle.startBattle();

        if (playerCharacter.isAlive()) {
            System.out.println("Congratulations! You cleared Floor " + floorNumber + ".");
            if (floorNumber % 5 == 0) {
                System.out.println("You found a shop!");
                shop.enterShop(playerCharacter);
            } else {
                System.out.println("You found some items!");
                generateItems(playerCharacter);
            }
        } else {
            System.out.println("You were defeated on Floor " + floorNumber + ". Game over!");
        }
    }

    private void generateItems(Character playerCharacter) {
        Random random = new Random();
        int itemCount = random.nextInt(3) + 1; // Generate 1 to 3 items

        for (int i = 0; i < itemCount; i++) {
            List<ShopItem> item = shop.generateRandomItems();
            ShopItem shopItem = new ShopItem((Item) item, item.get(i).getPrice());
            shopItem.displayItem();
            shop.purchaseItem(playerCharacter, shopItem);
        }
    }

}
