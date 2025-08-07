package august._02_08_25_classes.driver;

public class Car {

    private static final int Liters = 1;
    private Engine engine;
    private FuelTank fuelTank;
    private SteeringWheel steeringWheel;
    private Dashboard dashboard;
    private Door door;

    public Car(Engine engine, FuelTank fuelTank, SteeringWheel steeringWheel, Door door, Dashboard dashboard) {
        this.dashboard = dashboard;
        this.door = door;
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.steeringWheel = steeringWheel;
    }

    public void start() {
        engine.start();
    }

    public void drive(int distance) {
        int fuelNeeded = distance * Liters;
        fuelTank.useFuel(fuelNeeded);
        System.out.println("Driving: " + distance + "km");
    }

    public void refuel(int liters) {
        fuelTank.refuel(liters);
    }

    public void printStatus() {
        dashboard.showEngineStatus();
    }
}
