package august._08_08_25_classes.animal;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    public static void makeSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        Cat cat = new Cat("Moor");
        Cow cow = new Cow("Musya");
        Animal[] animals = {dog, cat, cow};
        for (Animal animal: animals) {
            makeSound(animal);
        }
    }
}
