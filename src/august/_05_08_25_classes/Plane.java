package august._05_08_25_classes;

public class Plane extends Vehicle {

    public void move() {
        System.out.println("Flying");
    }

    public static void moveTo(Vehicle vehicle, String finalPlace) {
        vehicle.move();
        System.out.println("To " + finalPlace);
    }

    public static void main(String[] args) {
        Vehicle car = new Car("wheel");
        Vehicle plane = new Plane();
//        car.move();
//        plane.move();
//        Car car2 = (Car) plane;
//        System.out.println(car2.getWheel());
        moveTo(plane, "Home");
    }
}
