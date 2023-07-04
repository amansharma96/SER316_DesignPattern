
import characters.Character;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CharacterTest {

    private Character character;

    @Before
    public void setUp() {
        // Create an instance of Character for testing
        character = new Character("John", 1, 100, 50,200) {
            @Override
            public void attack() {

            }

            @Override
            public void useSkill() {

            }
        };
    }

    @Test
    public void testGetters() {
        // Test the getters of Character class
        Assert.assertEquals("John", character.getName());
        Assert.assertEquals(1, character.getLevel());
        Assert.assertEquals(100, character.getMaxHealth());
        Assert.assertEquals(50, character.getMaxMana());
        Assert.assertEquals(50, character.getMaxGold());

    }

    @Test
    public void testLevelUp() {
        // Test the level up functionality of Character class
        character.levelUp();
        Assert.assertEquals(2, character.getLevel());
        Assert.assertEquals(150, character.getMaxHealth());
        Assert.assertEquals(75, character.getMaxMana());
    }

    @Test
    public void testHeal() {
        // Test the heal method of Character class
        character.heal(25);
        Assert.assertEquals(125, character.getCurrentHealth());

        // Healing should not exceed maximum health
        character.heal(100);
        Assert.assertEquals(150, character.getCurrentHealth());
    }

    @Test
    public void testTakeDamage() {
        // Test the takeDamage method of Character class
        character.takeDamage(30);
        Assert.assertEquals(70, character.getCurrentHealth());
    }

    // Add more test methods to cover other functionalities of the Character class

}

