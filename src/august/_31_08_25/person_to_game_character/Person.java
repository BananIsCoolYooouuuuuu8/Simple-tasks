package august._31_08_25.person_to_game_character;

public class Person {

    private String name;
    private int dayOfBirth;

    public Person(String name, int dayOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }
}
