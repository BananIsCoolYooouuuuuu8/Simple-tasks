package july._26_07_25_classes;

public class Classes {
    public static void main(String[] args) {
        Car ferrari = new Car(10);
        ferrari.setBrand("ferrari");
        ferrari.setModel("ferrari 1");
        ferrari.setSpeed(400);
        ferrari.start();
        Car toyota = new Car(87);
        toyota.setBrand("toyota");
        toyota.setModel("camry");
        toyota.setSpeed(900);
        toyota.start();
        System.out.println(ferrari.getBrand());
        Car newSpeed = new Car(90);
        System.out.println(newSpeed.getSpeed());
        Car newAttributes = new Car(20,"audi", "audi 2");
        newAttributes.start();
    }
}
