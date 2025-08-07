package august._06_08_25_classes.employee;

public class Chef extends Employee {

    public Chef(String name, double salary) {
        super(name, salary);
    }

    public void printResponsibility() {
        System.out.println("Cooking a dish");
    }
}
