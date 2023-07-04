package characters;

public class CharacterFactory {
    public static Character createCharacter(String name, String characterType) {
        Character character = null;
        switch (characterType) {
            case "Fighter":
                character = new Fighter(name);
                break;
            case "Mage":
                character = new Mage(name);
                break;
            case "Thief":
                character = new Thief(name);
                break;
            default:
                // Default character type if not recognized
                character = new Fighter(name);
                break;
        }
        return character;
    }
}
