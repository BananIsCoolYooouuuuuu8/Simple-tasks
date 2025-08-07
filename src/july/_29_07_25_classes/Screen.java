package july._29_07_25_classes;

public class Screen {

    private String brand;
    private double sizeInches;

    public Screen(String brand, double sizeInches) {
        this.brand = brand;
        this.sizeInches = sizeInches;
    }

    public void printInfo() {
        System.out.println("Screen: " + "Brand: " + brand + ", " + "SizeInches: " + sizeInches + ".");
    }
}
