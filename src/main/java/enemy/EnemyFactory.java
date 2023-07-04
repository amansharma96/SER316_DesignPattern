package enemy;

public class EnemyFactory {
    public Enemy createEnemy(String type) {
        switch (type) {
            case "Small":
                return new SmallEnemy();
            case "Medium":
                return new MediumEnemy();
            case "Boss":
                return new BossEnemy();
            default:
                throw new IllegalArgumentException("Invalid enemy type: " + type);
        }
    }
}
