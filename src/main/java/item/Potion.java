package item;

public class Potion extends Item {
    public Potion() {
        super("Potion", 20);
    }

    public Potion(String name, int power) {
        super("Potion", 20);
    }

    @Override
    public void use() {
        // Implement the logic for using a potion
    }
}
