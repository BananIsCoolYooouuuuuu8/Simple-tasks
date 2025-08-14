package august._12_08_25_enum;

public class Person {

    private String firstName;
    private String lastName;
    private String birthDate;

    public Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person(Person person)  {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        this.birthDate = person.birthDate;
    }

    public static void getInfo(Person person) {
        System.out.println("First name: " + person.firstName + " last name: " + person.lastName + " birth date: " + person.birthDate);
    }
}
