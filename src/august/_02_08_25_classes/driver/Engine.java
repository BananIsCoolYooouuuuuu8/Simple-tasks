package august._02_08_25_classes.driver;

public class Engine {
    private boolean isRunning = false;

    public boolean isRunning() {
        return isRunning;
    }

    public void start() {
        isRunning = true;
        System.out.println("The engine is running");
    }

    public void stop() {
        isRunning = false;
        System.out.println("The engine is stopping");
    }
}
