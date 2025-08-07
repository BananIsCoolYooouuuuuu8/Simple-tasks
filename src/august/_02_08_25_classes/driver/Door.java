package august._02_08_25_classes.driver;

public class Door {

    private boolean isOpen;

    public Door(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void open() {
        isOpen = true;
        System.out.println("The door is open");
    }

    public void close() {
        isOpen = false;
        System.out.println("The door is closed");
    }
}
