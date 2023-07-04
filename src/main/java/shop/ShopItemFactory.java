package shop;

import item.*;

import static item.ItemType.Type.*;

public class ShopItemFactory {
    public static Item createShopItem(ItemType.Type itemType) {
        switch (itemType) {
            case SWORD:
                return new Sword("Shop Sword", 10);
            case SHIELD:
                return new Shield("Shop Shield", 5);
            case HELMET:
                return new Helmet("Shop Helmet", 8);
            case ARMOR:
                return new Armor("Shop Armor", 15);
            case BOOTS:
                return new Boots("Shop Boots", 7);
            case MAGIC_SCROLL:
                return new MagicScroll("Shop Magic Scroll",50);
            case POTION:
                return new Potion("Shop Potion",20);
            case INSTANT_LEVEL_UP:
                return new InstantLevelUpItem("Shop Instant Level Up Item",500);
            default:
                throw new IllegalArgumentException("Invalid item type.");
        }
    }
}
