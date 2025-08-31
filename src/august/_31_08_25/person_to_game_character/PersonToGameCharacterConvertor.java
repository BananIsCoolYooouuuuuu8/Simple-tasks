package august._31_08_25.person_to_game_character;

@FunctionalInterface
public interface PersonToGameCharacterConvertor {
    GameCharacter convert(Person person);
}
