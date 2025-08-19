package august._19_08_25.fiveCopyClasses;

import java.util.Objects;

public class FuelTank {

    private int capacity;
    private int level;

    public FuelTank(int capacity, int level) {
        this.capacity = capacity;
        this.level = level;
    }

    public FuelTank(FuelTank fuelTank) {
        this.capacity = fuelTank.capacity;
        this.level = fuelTank.level;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof FuelTank)) {
            return false;
        }
        FuelTank fuelTank = (FuelTank) object;
        return Objects.equals(this.capacity, ((FuelTank) object).capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(capacity);
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
