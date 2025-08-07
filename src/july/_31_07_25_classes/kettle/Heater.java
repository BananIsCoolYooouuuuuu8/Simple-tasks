package july._31_07_25_classes.kettle;

public class Heater {

    private String brand;
    private int powerWatt;

    public Heater(String brand, int powerWatt) {
        this.brand = brand;
        this.powerWatt = powerWatt;
    }

    public void printInfo() {
        System.out.println("Heater: Brand: " + brand + ", PowerWatt: " + powerWatt);
    }
}
