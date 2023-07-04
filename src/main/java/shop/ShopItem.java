package shop;

import item.Item;
import item.ItemType;

import java.util.List;

public class ShopItem {
    private String name;
    private ItemType.Type itemType;
    private int price;
    private List<ShopItem> items;

    public ShopItem(String name, ItemType.Type itemType, int price) {
        this.name = name;
        this.itemType = itemType;
        this.price = price;
    }

    public ShopItem(Item item, int price) {

        this.itemType = itemType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ItemType.Type getItemType() {
        return itemType;
    }

    public int getPrice() {
        return price;
    }

    public List<ShopItem> getItems() {
        return items;
    }


    public Item getItem() {
        return (Item) items;
    }

    public void displayItem() {
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);

        // Display other item details if needed
    }


}
