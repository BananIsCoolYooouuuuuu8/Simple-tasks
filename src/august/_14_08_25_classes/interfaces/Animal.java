package august._14_08_25_classes.interfaces;

interface Animal extends Jumpable {

    String name = "joe";
    void animalSound();
    void run();
}

abstract class AnimalClass implements Animal{
    public static void main(String[] args) {
        Jumpable tiger = new Jumpable() {
            public void jumpUp() {

            }

            @Override
            public void jump() {
            }
        };
    }
//    @Override
//    public void run() {
//    }
}