package august._31_08_25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MainGC {

    public static void main(String[] args) {
        Person person1 = new Person("bob", 16);
        Person person2 = new Person("alex", 10);
        Person person3 = new Person("kelly", 7);
        Person person4 = new Person("john", 31);
        Person person5 = new Person("sam", 18);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        convertPersonsToGameCharacters(persons, person -> {
            if (person.getName().length() < 5) {
                return new Warrior();
            } else if (person.getName().charAt(person.getName().length() - 1) == 'y' && (person.getDayOfBirth() >= 1 && person.getDayOfBirth() <= 15)) {
                return new Wizard();
            } else {
                return new Witcher();
            }
        });
    }

    public static List<GameCharacter> convertPersonsToGameCharacters(List<Person> persons, PersonToGameCharacterConvertor personToGameCharacterConvertor) {
        List<GameCharacter> gameCharacters = new ArrayList<>();
        persons.forEach(person -> {
            GameCharacter gameCharacter = personToGameCharacterConvertor.convert(person);
            gameCharacters.add(gameCharacter);
        });
        return gameCharacters;
    }
}
