package july._29_07_25_classes;

public class Processor {

    private String brand;
    private double frequencyGhz;

    public Processor(String brand, double frequencyGhz) {
        this.brand = brand;
        this.frequencyGhz = frequencyGhz;
    }

    public void printInfo() {
        System.out.println( "Processor: " + "Brand: " + brand + ", " + "FreduencyGhz: " + frequencyGhz + ". ");
    }
}
