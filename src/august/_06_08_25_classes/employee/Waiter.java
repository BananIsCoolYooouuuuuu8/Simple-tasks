package august._06_08_25_classes.employee;

public class Waiter extends Employee{

    public Waiter(String name, double salary) {
        super(name, salary);
    }

    public void printResponsibility() {
        System.out.println("Serves the client");
    }
}
