package item;

public class Helmet extends Item {
    public Helmet() {
        super("Helmet", 80);
    }

    public Helmet(String name, int power) {
        super("Helmet", 80);
    }

    @Override
    public void use() {
        // Implement the logic for using a helmet
    }
}
