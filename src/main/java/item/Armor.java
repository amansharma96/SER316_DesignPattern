package item;

public class Armor extends Item {
    public Armor() {
        super("Armor", 200);
    }

    public Armor(String name, int power) {
        super("Armor", 200);
    }

    @Override
    public void use() {
        // Implement the logic for using an armor
    }
}
