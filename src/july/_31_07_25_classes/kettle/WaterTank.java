package july._31_07_25_classes.kettle;

public class WaterTank {

    private int capacityMl;
    private int currentAmountMl;

    public WaterTank(int capacityMl, int currentAmountMl) {
        this.capacityMl = capacityMl;
        this.currentAmountMl = currentAmountMl;
    }

    public void setCurrentAmountMl(int currentAmountMl) {
        this.currentAmountMl = currentAmountMl;
    }

    public int getCurrentAmountMl() {
        return currentAmountMl;
    }

    public int getCapacityMl() {
        return capacityMl;
    }

    public void fill(int amountMl) {
        if (getCurrentAmountMl() + amountMl <= getCapacityMl()) {
            setCurrentAmountMl(getCurrentAmountMl() + amountMl);
        } else {
            System.out.println("Overflow, too much water");
            setCurrentAmountMl(getCapacityMl());
        }
    }
    public void printInfo() {
        System.out.println("WaterTank: CapacityMl" + capacityMl + ", " + "CurrentAmountMl: " + currentAmountMl);
    }
}