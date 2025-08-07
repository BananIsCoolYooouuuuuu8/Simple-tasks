package august._07_08_25_classes.employeeCopy;

public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printResponsibility() {
        System.out.println("working");
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
