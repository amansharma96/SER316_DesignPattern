package item;

public class Sword extends Item {
    public Sword() {
        super("Sword", 100);
    }

    public Sword(String name, int power) {
        super("Sword", 100);
    }

    @Override
    public void use() {
        // Implement the logic for using a sword
    }
}
