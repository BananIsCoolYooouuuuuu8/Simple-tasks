package july._29_07_25_classes;

public class Ram {

    private String brand;
    private double capacityMb;

    public Ram(String brand, double capacityMb) {
        this.brand = brand;
        this.capacityMb = capacityMb;
    }

    public void printInfo() {
        System.out.println("Ram: " + "Brand: " + brand + ", " + "CapacityMb: " + capacityMb + ". ");
    }
}
