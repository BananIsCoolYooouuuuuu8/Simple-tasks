package august._02_08_25_classes.driver;

public class Dashboard {

    private FuelTank fuelTank;
    private Engine engine;

    public Dashboard(Engine engine) {
        this(null,engine);
    }

    public Dashboard(FuelTank fuelTank, Engine engine) {
        this.fuelTank = fuelTank;
        this.engine = engine;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + fuelTank.getLevel());
    }

    public void showEngineStatus() {
        if (engine.isRunning()) {
            System.out.println("The engine is running");
        } else {
            System.out.println("The engine is stopping");
        }
    }

    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard(new Engine());
    }
}
