package august._16_08_25.connectable;

public class LapTop implements Connectable, Rechargeable {

    private int batteryLevel;
    private boolean isConnected;

    public LapTop(int batteryLevel) {
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
        System.out.println("connecting to bluetooth");
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
        System.out.println("Your smartWatch is charged for 2h");
    }

    @Override
    public void charge(int percentage) {
        if (batteryLevel + percentage <= 100) {
            setBatteryLevel(batteryLevel + percentage);
        } else {
           setBatteryLevel(100);
        }
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(50);
        SmartWatch smartWatch = new SmartWatch(40);
        LapTop lapTop = new LapTop(30);
        smartphone.charge(40);
        System.out.println(smartphone.getBatteryLevel());
        smartphone.connect();
        System.out.println(smartphone.isConnected());
        smartphone.chargeFull();
        System.out.println(smartphone.getBatteryLevel());
        smartphone.charge(1);
        System.out.println(smartphone);
    }
}
