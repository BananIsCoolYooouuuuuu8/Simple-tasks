package august._07_08_25_classes.employeeCopy;

public class Waiter extends Employee {

    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printResponsibility() {
        System.out.println("Serves the client");
    }
}
