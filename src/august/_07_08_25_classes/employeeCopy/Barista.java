package august._07_08_25_classes.employeeCopy;

public class Barista extends Employee {

    public Barista(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printResponsibility() {
        System.out.println("Make a coffee");
    }

    public static void printToResponsibility(Employee employee) {
        employee.printResponsibility();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("David", 1000);
        Employee chef = new Chef("Sam", 2000);
        Employee waiter = new Waiter("Doug", 3000);
        Employee barista = new Barista("Sarah", 4000);
        printToResponsibility(chef);
    }
}
