package july._29_07_25_classes;

public class Phone {

    private Processor processor;
    private Ram ram;
    private Storage storage;
    private Screen screen;

    public Phone(Processor processor, Ram ram, Storage storage, Screen screen) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
    }

    public void installApp(MobileApplication mobileApplication) {
        if (storage.getAvailableMb() < mobileApplication.getSizeMb()) {
            System.out.println("Free up disk space before installing the application. Insufficient: " + (mobileApplication.getSizeMb() - storage.getAvailableMb()) + "mb");
        } else {
            System.out.println("Installing the app: " + mobileApplication.getTitle());
            storage.setUsedMb(storage.getUsedMb() + mobileApplication.getSizeMb());
            storage.getAvailableMb();
            System.out.println("App is installed");
        }
    }

    public void uninstallApp(MobileApplication mobileApplication) {
        System.out.println("Uninstalling the app...");
        storage.setUsedMb(storage.getUsedMb() - mobileApplication.getSizeMb());
        System.out.println("App is uninstalled");
    }

    public void printInfo() {
        processor.printInfo();
        ram.printInfo();
        storage.printInfo();
        screen.printInfo();
    }

    public static void main(String[] args) {
        MobileApplication mobileApplication = new MobileApplication("Cars game",100);
        Processor processor = new Processor("Snapdragon 8s Gen 4 ",3210);
        Ram ram = new Ram("Corsair",32);
        Storage storage = new Storage("KESU-2518",500.0, 0);
        Screen screen = new Screen("Realme", 10000);
        Phone phone = new Phone(processor,ram,storage,screen);
        phone.installApp(mobileApplication);
        phone.uninstallApp(mobileApplication);
        phone.printInfo();
    }
}
