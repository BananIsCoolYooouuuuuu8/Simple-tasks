package august._16_08_25.connectable;

public class SmartWatch implements Connectable, Rechargeable {

    private int batteryLevel;
    private boolean isConnected;

    public SmartWatch(int batteryLevel) {
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
        System.out.println("connecting to smartphone");
        isConnected = true;
    }

    @Override
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
        System.out.println("Your smartWatch is charged for 30 min");
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
