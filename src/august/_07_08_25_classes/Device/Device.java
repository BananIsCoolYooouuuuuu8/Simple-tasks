package august._07_08_25_classes.Device;

public class Device {

    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void execute(String document) {
        System.out.println();
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
    }
}
