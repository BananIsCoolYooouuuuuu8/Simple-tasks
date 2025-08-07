package august._07_08_25_classes.Device;

public class Scanner extends Device {

    private String quality;

    public Scanner(String brand, String quality) {
        super(brand);
        this.quality = quality;
    }

    @Override
    public void execute(String document) {
        System.out.println("Scanning " + document);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Scan quality: " + quality);
    }
}
