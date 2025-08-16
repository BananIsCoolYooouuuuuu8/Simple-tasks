package august._16_08_25.connectable;

public class Smartphone implements Connectable, Rechargeable {

    private int batteryLevel;
    private boolean isConnected;

    public Smartphone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void connect() {
        System.out.println("connecting to wi-fi");
        isConnected = true;
    }

    public void disconnect() {
        System.out.println("disconnect");
        isConnected = false;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public void chargeFull() {
        setBatteryLevel(100);
        System.out.println("Your smartphone is charged for 1h");
    }

    @Override
    public void charge(int percentage) {
        if (batteryLevel + percentage <= 100) {
            setBatteryLevel(batteryLevel + percentage);
        } else {
            setBatteryLevel(100);
        }
    }
}
