package race;

public abstract class Race {
    private String name;
    private String description;

    public Race(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void applyPassiveSkill();

    // Getters and setters for name and description
}
