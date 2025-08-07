package august._07_08_25_classes.Device;

public class Projector extends Device {

    public String resolution;

    public Projector(String brand, String resolution) {
        super(brand);
        this.resolution = resolution;
    }

    @Override
    public void execute(String document) {
        System.out.println("Displaying : " + document);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("screen resolution: " + resolution);
    }

    public static void execute(Device device, String document) {
        device.execute(document);
    }

    public static void printInfo(Device device) {
        device.printInfo();
    }

    public static void main(String[] args) {
        Device device = new Device("Samsung");
        Printer printer = new Printer("PrintComp", 10, 100);
        Scanner scanner = new Scanner("Realme", "High");
        Projector projector = new Projector("ProjTM", "1080x1920");
        printInfo(projector);
        execute(projector, "document");
        printInfo(scanner);
        execute(device, "document");
    }
}
