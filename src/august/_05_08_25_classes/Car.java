package august._05_08_25_classes;

public class Car extends Vehicle {

    public Car(String wheel) {
        this.wheel = wheel;
    }

    private String wheel;

    public String getWheel() {
        return wheel;
    }

    @Override
    public void move() {
        System.out.println("driving");
    }
}
