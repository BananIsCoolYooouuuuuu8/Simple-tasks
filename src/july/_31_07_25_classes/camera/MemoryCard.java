package july._31_07_25_classes.camera;

public class MemoryCard {

    private double capacity;
    private double freeMb;

    public MemoryCard(double capacity, double freeMb) {
        this.capacity = capacity;
        this.freeMb = freeMb;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFreeMb() {
        return freeMb;
    }

    public void setFreeMb(double freeMb) {
        this.freeMb = freeMb;
    }
}
