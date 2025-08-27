package august._27_08_25.person;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException{
        if (age < 0) {
            throw new IllegalArgumentException("Negative age, incorrect");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Too old, incorrect");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("David", 17);
        try {
            person.setAge(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Negative age");
        }
    }
}
