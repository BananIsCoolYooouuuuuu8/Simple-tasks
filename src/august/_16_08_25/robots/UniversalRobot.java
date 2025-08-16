package august._16_08_25.robots;

public class UniversalRobot extends Robot implements Movable, Speakable, Workable {

    public UniversalRobot(String name, String dateOfManufacture) {
        super(name, dateOfManufacture);
    }

    @Override
    public void moveForward() {
        System.out.println("Robot: " + name + " is jumping");
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    @Override
    public void doWork() {
        System.out.println("Robot: " + name + " is working");
    }

    public static void main(String[] args) {
        CleaningRobot cleaningRobot = new CleaningRobot("Bob", "10.10.2010");
        UniversalRobot universalRobot = new UniversalRobot("John", "16.08.2025");
        System.out.println(cleaningRobot.toString());
        universalRobot.say("i'm universal robot");
        universalRobot.moveForward();
        cleaningRobot.doWork();
    }
}
