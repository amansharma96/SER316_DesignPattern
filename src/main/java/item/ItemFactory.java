package item;

import java.util.Random;

import static item.ItemType.Type.*;

public class ItemFactory {
    private Random random;

    public ItemFactory() {
        random = new Random();
    }

    public Item createRandomItem() {
        ItemType.Type itemType = getRandomItemType();
        String name = generateRandomItemName(itemType);
        int power = generateRandomPower();

        switch (itemType) {
            case SWORD:
                return new Sword(name, power);
            case SHIELD:
                return new Shield(name, power);
            case HELMET:
                return new Helmet(name, power);
            case ARMOR:
                return new Armor(name, power);
            case BOOTS:
                return new Boots(name, power);
            case MAGIC_SCROLL:
                return new MagicScroll(name, power);
            case POTION:
                return new Potion(name, power);
            case INSTANT_LEVEL_UP:
                return new InstantLevelUpItem(name, power);
            default:
                throw new IllegalArgumentException("Invalid item type.");
        }
    }

    private ItemType.Type getRandomItemType() {
        ItemType.Type[] itemTypes = values();
        int index = random.nextInt(itemTypes.length);
        return itemTypes[index];
    }

    private String generateRandomItemName(ItemType.Type itemType) {
        // Implement logic to generate a random name based on item type
        return "";
    }

    private int generateRandomPower() {
        // Implement logic to generate a random power value for the item
        return 0;
    }

}
