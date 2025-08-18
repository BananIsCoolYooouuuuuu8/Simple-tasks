package august._04_08_25_classes.employer;

import java.util.Objects;

public class Employee {

    private String name;
    private String currentTask;

    public Employee(String name) {
        this.name = name;
    }

    public boolean equals(Employee employee) {
        return Objects.equals(this.name, employee.name);//=,eq
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
