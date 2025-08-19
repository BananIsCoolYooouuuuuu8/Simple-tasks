package july._29_07_25_classes;

import java.util.Objects;

public class Screen {

    private String brand;
    private double sizeInches;

    public Screen(String brand, double sizeInches) {
        this.brand = brand;
        this.sizeInches = sizeInches;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Screen)) {
            return false;
        }
        Screen screen = (Screen) object;
        return Objects.equals(this.brand, screen.brand) && this.sizeInches == screen.sizeInches;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, sizeInches);
    }

    public void printInfo() {
        System.out.println("Screen: " + "Brand: " + brand + ", " + "SizeInches: " + sizeInches + ".");
    }

    public static void main(String[] args) {
        Screen screen = new Screen("jop", 100);
        Screen screen2 = new Screen("jop", 100);
        System.out.println(Objects.equals(screen, screen2));
    }
}
