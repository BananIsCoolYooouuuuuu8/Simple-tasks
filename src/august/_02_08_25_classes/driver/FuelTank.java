package august._02_08_25_classes.driver;

public class FuelTank {

    private int capacity;
    private int level;

    public FuelTank(int capacity, int level) {
        this.capacity = capacity;
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean useFuel(int liters) {
        boolean hasEnoughFuel = getLevel() >= liters;
        if (hasEnoughFuel) {
            setLevel(getLevel() - liters);
        }
        return hasEnoughFuel;
    }

    public void refuel(int liters) {
        if (liters + getLevel() <= getCapacity()) {
            setLevel(getLevel() + liters);
        } else {
            setLevel(getCapacity());
        }
    }
}
