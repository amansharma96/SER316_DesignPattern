package enemy;

public class BossEnemy extends Enemy {
    private int health;
    private int attackDamage;

    public BossEnemy() {
        super("Boss",150,30,15);

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
