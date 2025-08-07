package july._29_07_25_classes;

public class Storage {

    private String brand;
    private double capacityMb;
    private double usedMb;

    public Storage(String brand, double capacityMb, double usedMb) {
        this.brand = brand;
        this.capacityMb = capacityMb;
        this.usedMb = usedMb;
    }

    public double getCapacityMb() {
        return capacityMb;
    }

    public double getUsedMb() {
        return usedMb;
    }

    public void setUsedMb(double usedMb) {
        this.usedMb = usedMb;
    }

    public double getAvailableMb() {
        return capacityMb - usedMb;
    }

    public void printInfo() {
        System.out.println("Storage: " + "Brand: " + brand + ", " + "CapacityMb: " + capacityMb + ", " + "UsedMb: " + usedMb + ", " + "AvailableMb: " + getAvailableMb() + ".");
    }
}
