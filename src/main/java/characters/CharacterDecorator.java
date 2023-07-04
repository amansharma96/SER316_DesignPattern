package characters;

public abstract class CharacterDecorator extends Character {
    protected Character decoratedCharacter;

    public CharacterDecorator(Character decoratedCharacter) {
        super(decoratedCharacter.getName());
        this.decoratedCharacter = decoratedCharacter;
    }

    // Override methods to add additional behavior

    @Override
    public void attack() {
        decoratedCharacter.attack();
    }

    @Override
    public void useSkill() {
        decoratedCharacter.useSkill();
    }

    // Override getters and setters as needed
}
