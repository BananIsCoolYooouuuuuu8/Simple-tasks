package august._06_08_25_classes.employee;

public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
