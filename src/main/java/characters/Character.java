package characters;

import item.Item;

import java.util.List;

public abstract class Character {
    protected String name;
    protected int level;
    protected int health;
    protected int mana;

    protected int gold;

    protected List<Item> inventory;
    protected int experiencePoints;
    // Add other attributes as needed

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.health = 100;
        this.mana = 100;
        this.gold = 200;
    }

    public Character(String name, int i, int i1, int i2,int i3) {
        this.name = name;
        this.level = i;
        this.health = i2;
        this.mana = i2;
        this.gold = i3;
    }

    public abstract void attack();
    public abstract void useSkill();

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int calculateDamage() {
        // Implement your logic to calculate damage here
        // Consider the character's level, equipment, skills, etc.
        // Return the calculated damage value

        int baseDamage = 10; // A default base damage value

        // Example: Incorporate character's level into damage calculation
        int levelMultiplier = 2; // Assume the damage increases by 2 for each level

        return baseDamage + (level * levelMultiplier);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int getGold() {
        return gold;
    }
    

    public void decreaseGold(int price) {
        this.gold = gold-price;
    }

    public void addItemToInventory(Item selectedItem) {
        inventory.add(selectedItem);
        System.out.println(selectedItem.getName() + " has been added to your inventory.");
    }

    public int getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return 100;
    }

    public void heal(int amount) {
        int newHealth = this.health + amount;
        int maxHealth = 100;

        if (newHealth > maxHealth) {
            this.health = (maxHealth);
        } else this.health = (newHealth);
    }

    public void gainExperience(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentHealth() {
        return health;
    }

    public int getCurrentMana() {
        return mana;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public Object getMaxMana() {
        return 100;
    }

    public void restoreMana(int maxMana) {
       this.mana = maxMana;

    }

    public void displayStats() {
        System.out.println("===== Character Stats =====");
        System.out.println("Name: " + getName());
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Level: " + getLevel());
        System.out.println("Health: " + getCurrentHealth() + "/" + getMaxHealth());
        System.out.println("Mana: " + getCurrentMana() + "/" + getMaxMana());
        System.out.println("Experience Points: " + getExperiencePoints());
    }
    public List<Item> getInventory() {
        return (List<Item>) inventory;
    }
    public void displayInventory() {
        System.out.println("===== Inventory =====");
        System.out.println("Gold: " + this.getGold());

        List<Item> inventory = this.getInventory();

        if (inventory == null) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Items:");
            for (Item item : inventory) {
                System.out.println("- " + item.getName());
            }
        }
    }

    public int getMaxGold() {
        return 200;
    }

    public void levelUp() {

        this.level = this.level+1;
        this.health = health+50;
        this.mana = mana+50;
        this.gold = gold+100;
    }


    // Add other methods as needed
    
    // Getters and setters for attributes
}

