package august._06_08_25_classes.employee;

public class Barista extends Employee {

    public Barista(String name, double salary) {
        super(name, salary);
    }

    public void printResponsibility() {
        System.out.println("Make a coffee");
    }

    public static void main(String[] args) {
        Employee employee = new Employee("David", 1000);
        Chef chef = new Chef("Sam", 2000);
        Waiter waiter = new Waiter("Doug", 3000);
        Barista barista = new Barista("Sarah", 4000);
        chef.printResponsibility();
        chef.printInfo();
    }
}
