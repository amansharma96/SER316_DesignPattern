package item;

public class Boots extends Item {
    public Boots() {
        super("Boots", 60);
    }

    public Boots(String name, int power) {
        super("Boots", 60);
    }

    @Override
    public void use() {
        // Implement the logic for using boots
    }
}
