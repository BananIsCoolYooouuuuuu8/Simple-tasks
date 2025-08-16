package august._14_08_25_classes.interfaces;

public class Pig implements Animal, Jumpable, Screamable {

    public String colour;

    @Override
    public void animalSound() {
        System.out.println(Animal.name);
    }

    @Override
    public void run() {
        colour = "green";
    }

    @Override
    public void jump() {
    }

    @Override
    public void scream() {
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.scream();
    }
}
