package enemy;

public class MediumEnemy extends Enemy {
    private int health;
    private int attackDamage;

    public MediumEnemy() {
        super("Medium",100,20,10);

    }

    @Override
    public void attack() {
        System.out.println("SmallEnemy attacks for " + attackDamage + " damage.");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("SmallEnemy has been defeated!");
        }
    }
}
