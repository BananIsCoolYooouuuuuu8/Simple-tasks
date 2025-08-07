package july._31_07_25_classes.kettle;

public class Kettle {

    private Heater heater;
    private WaterTank waterTank;
    private final static int MIN_WATER_COUNT_TO_BOIL = 300;

    public Kettle(Heater heater, WaterTank waterTank) {
        this.heater = heater;
        this.waterTank = waterTank;
    }

    public void boilWater() {
        if (waterTank.getCurrentAmountMl() >= MIN_WATER_COUNT_TO_BOIL) {
            System.out.println("The water is heating up");
        } else {
            System.out.println("Error");
        }
    }

    public void fillKettle(int countWater) {
        waterTank.fill(countWater);
    }

    public void printInfo() {
        heater.printInfo();
        waterTank.printInfo();
    }

    public static void main(String[] args) {
        Heater heater = new Heater("Wash", 2000);
        WaterTank waterTank = new WaterTank(1000,0);
        Kettle kettle = new Kettle(heater, waterTank);
        kettle.boilWater();
        kettle.fillKettle(500);
        kettle.printInfo();
    }
}
