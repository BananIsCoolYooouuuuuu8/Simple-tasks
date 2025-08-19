package august._19_08_25.fiveClassesCopy;

import java.util.Objects;

public class Employee {

    private String name;
    private String currentTask;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) object;
        return Objects.equals(this.name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public void doTask(String task) {
        System.out.println("I'm doing " + task + "... It's done");
        this.currentTask = null;
    }

    public void printInfo() {
        if (currentTask == null || currentTask.isEmpty()) {
            System.out.println(name + " free now");
        } else {
            System.out.println(name + " is doing task: " + currentTask);
        }
    }
}
