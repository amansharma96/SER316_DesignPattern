package item;

public abstract class Item {
    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public abstract void use();

    public String getName() {
        return name;
    }
    public int getPrice(){
        return value;
    }

    public void add(Item selectedItem) {
        this.name = selectedItem.name;
        this.value = selectedItem.value;
    }

    public int getDamage() {
        return value;
    }


    // Getters and setters for name and value
}
