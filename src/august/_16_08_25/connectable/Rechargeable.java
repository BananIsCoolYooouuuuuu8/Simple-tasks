package august._16_08_25.connectable;

interface Rechargeable {

    int getBatteryLevel();

    void chargeFull();
    void charge(int percentage);
}
