package enemy;

public abstract class Enemy {
    private String name;
    private int health;
    private int attackPower;
    private int defense;
    private int experiencePoints;

    public Enemy(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public abstract void attack();

    public abstract void takeDamage(int damage);

    public int getExperiencePoints() {
        return experiencePoints;

    }

    public boolean isAlive() {
        return health>0;
    }

    public int calculateDamage() {
        return attackPower;
    }
}
