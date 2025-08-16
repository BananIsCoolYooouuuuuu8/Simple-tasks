package august._16_08_25.robots;

public class CleaningRobot extends Robot implements Movable, Workable {

    public CleaningRobot(String name, String dateOfManufacture) {
        super(name, dateOfManufacture);
    }

    @Override
    public void moveForward() {
        System.out.println("Robot: " + name + " is running");
    }

    @Override
    public void doWork() {
        System.out.println("Robot: " + name + " is working");
    }
}
