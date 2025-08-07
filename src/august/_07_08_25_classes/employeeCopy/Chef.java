package august._07_08_25_classes.employeeCopy;

public class Chef extends Employee {

    public Chef(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printResponsibility() {
        System.out.println("Cooking a dish");
    }
}
