package july._31_07_25_classes.camera;

public class Battery {

    private double capacity;
    private double currentPercentage;

    public Battery(double capacity) {
        this(capacity, 0);
//        this.capacity = capacity;
//        currentPercentage = 0;
    }

    public Battery(double capacity, double currentPercentage) {
        this.capacity = capacity;
        this.currentPercentage = currentPercentage;
    }

    public double getCurrentPercentage() {
        return currentPercentage;
    }

    public void setCurrentPercentage(double currentPercentage) {
        this.currentPercentage = currentPercentage;
    }
}
