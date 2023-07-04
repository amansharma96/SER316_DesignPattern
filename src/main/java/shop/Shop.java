package shop;

import characters.Character;
import item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Shop {
    private List<ShopItem> items;

    public Shop() {
        items = generateRandomItems();
    }

    public List<ShopItem> generateRandomItems() {
        List<ShopItem> generatedItems = new ArrayList<>();
        Random random = new Random();

        // Generate random items for the shop
        // Replace this code with your own item generation logic
        // Example: Generating random swords
        for (int i = 0; i < 3; i++) {
            String itemName = "Sword " + (i + 1);
            int itemPrice = random.nextInt(100) + 50; // Generate a random price between 50 and 150
            Item item = new Item(itemName, itemPrice) {
                @Override
                public void use() {

                }
            };

            generatedItems.add(new ShopItem(item, itemPrice));
        }

        return generatedItems;
    }

    public void enterShop(Character playerCharacter) {
        System.out.println("Welcome to the shop! Here are the available items:");

        // Display the items in the shop
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getItem().getName() + " - " + items.get(i).getPrice() + " gold");
        }

        // Prompt the player to select an item
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the item you want to purchase (or 0 to exit):");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= items.size()) {
            ShopItem selectedShopItem = items.get(choice - 1);
            Item selectedItem = selectedShopItem.getItem();

            if (playerCharacter.getGold() >= selectedShopItem.getPrice()) {
                // Deduct the gold from the player's character
                playerCharacter.decreaseGold(selectedShopItem.getPrice());

                // Add the purchased item to the player's inventory
                playerCharacter.addItemToInventory(selectedItem);

                System.out.println("You have purchased " + selectedItem.getName() + " for " + selectedShopItem.getPrice() + " gold.");
            } else {
                System.out.println("You don't have enough gold to purchase this item.");
            }
        } else if (choice != 0) {
            System.out.println("Invalid choice.");
        }
    }

    public List<ShopItem> getItems() {
        return items;
    }

    public void purchaseItem(Character playerCharacter, ShopItem shopItem) {
        Item item = shopItem.getItem();
        int price = shopItem.getPrice();

        // Check if the player has enough money to purchase the item
        if (playerCharacter.getGold() >= price) {
            // Deduct the price from the player's money
            playerCharacter.decreaseGold(price);

            // Add the item to the player's inventory
            playerCharacter.addItemToInventory(item);

            System.out.println("You purchased " + item.getName() + " for " + price + " coins.");
        } else {
            System.out.println("You don't have enough money to purchase this item.");
        }
    }
}
