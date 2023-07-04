package trainer;

import characters.Character;
import enemy.Enemy;
import battle.Battle;

public class Trainer {
    private Character character;


    public Trainer(Character character) {
        this.character = character;
    }

    public void train(Enemy opponent) {
        Battle battle = new Battle(character, opponent);
        battle.startBattle();

        if (character.isAlive()) {
            System.out.println(character.getName() + " has successfully defeated " + opponent.getName());
            character.gainExperience(opponent.getExperiencePoints());
        } else {
            System.out.println(character.getName() + " was defeated by " + opponent.getName());
        }
    }

    public Character getCharacter() {
        return character;
    }
}
