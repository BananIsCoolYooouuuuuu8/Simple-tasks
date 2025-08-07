package august._02_08_25_classes.driver;

public class Driver {

    private String name;
    private Car car = null;
    private boolean isInCar = false;

    public Driver(String name, Car car, boolean isInCar) {
        this.name = name;
        this.car = car;
        this.isInCar = isInCar;
    }

    public void enterCar(Car car) {
        if (!isInCar) {
            this.car = car;
            isInCar = true;
            System.out.println(name + " got in the car");
        }
    }

    public void exitCar() {
        if (isInCar) {
            this.car = null;
            isInCar = false;
            System.out.println(name + " got out of the car");
        }
    }

    public void startEngine() {
        if (isInCar && car != null) {
            car.start();
        }
    }

    public void drive(int distanceKm) {
        if (isInCar && car != null) {
            car.drive(distanceKm);
        }
    }

    public void checkDashboard() {
        if (isInCar && car != null) {
            car.printStatus();
        }
    }

    public void refuel(int liters) {
        if (isInCar && car != null) {
            car.refuel(liters);
        }
    }

    public static void main(String[] args) {
        Door door = new Door(true);
        Engine engine = new Engine();
        FuelTank fuelTank = new FuelTank(20,0);
        Dashboard dashboard = new Dashboard(fuelTank,engine);
        SteeringWheel steeringWheel = new SteeringWheel();
        Car car = new Car(engine,fuelTank, steeringWheel,door,dashboard);
        Driver driver = new Driver("Ivan", car, false);
        door.open();
        driver.enterCar(car);
        driver.startEngine();
        driver.drive(500);
        driver.checkDashboard();
        driver.refuel(5);
        dashboard.showEngineStatus();
        dashboard.showFuelLevel();
        fuelTank.useFuel(4);
        dashboard.showFuelLevel();
        driver.exitCar();
    }
}