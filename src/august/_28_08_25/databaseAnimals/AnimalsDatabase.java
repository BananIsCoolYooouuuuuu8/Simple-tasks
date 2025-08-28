package august._28_08_25.databaseAnimals;

import august._08_08_25_classes.animal.Animal;
import august._08_08_25_classes.animal.Cat;
import august._08_08_25_classes.animal.Cow;
import august._08_08_25_classes.animal.Dog;

import java.sql.SQLException;

public class AnimalsDatabase extends Database {

    Cat cat = new Cat("gopy");
    Cow cow = new Cow("musya");
    Dog dog = new Dog("rex");
    Animal[] animals = {cat, cow, dog};

    public Animal[] getAnimal() throws NoDatabaseConnectionDetectedException {
        if (isConnected) {
            return animals;
        } else {
            throw new NoDatabaseConnectionDetectedException();
        }
    }

    public static void main(String[] args) {
        AnimalsDatabase animalsDatabase = new AnimalsDatabase();
        try {
            animalsDatabase.connect();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            animalsDatabase.getAnimal();
        } catch (NoDatabaseConnectionDetectedException e) {
            System.out.println("NoDatabaseConnectionDetectedException");
        } finally {
            System.out.println("The work with the database is completed");
        }
    }
}
