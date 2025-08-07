package august._07_08_25_classes.Device;

public class Printer extends Device {

    private int inkLeftMl;
    private int inkCapacityMl;

    public Printer(String brand, int inkLeftMl, int inkCapacityMl) {
        super(brand);
        this.inkLeftMl = inkLeftMl;
        this.inkCapacityMl = inkCapacityMl;
    }

    @Override
    public void execute(String document) {
        System.out.println("Typing " + document);
    }

    @Override
    public void printInfo() {
        System.out.println("Brand: " + brand);
        super.printInfo();
        System.out.println(inkLeftMl + " / " + inkCapacityMl + "ml");
    }
}
