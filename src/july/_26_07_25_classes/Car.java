package july._26_07_25_classes;

public class Car {
    public int speed;
    public String brand;
    private String model;

    public Car(int speed, String brand, String model) {
        this.speed = speed;
        this.brand = brand;
        this.model = model;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        System.out.println("The car " + brand + " " + model + " is started");
    }
}
