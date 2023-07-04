package enemy;

public class SmallEnemy extends Enemy {
    private int health;
    private int attackDamage;

    public SmallEnemy() {
        super("Small",50,10,5);
        this.health = 50;
        this.attackDamage = 10;
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
