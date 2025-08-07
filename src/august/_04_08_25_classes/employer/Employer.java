package august._04_08_25_classes.employer;

public class Employer {

    private String name;
    private Employee accountant;
    private Employee engineer;

    public Employer(String name) {
        this(name,null, null);
    }

    public Employer(String name, Employee engineer) {
        this(name, null, engineer);
    }

    public Employer(String name, Employee accountant, Employee engineer) {
        this.name = name;
        this.accountant = accountant;
        this.engineer = engineer;
    }

    public void hireAccountant(Employee e) {
        this.accountant = e;
        System.out.println("You is hired an accountant");
    }

    public void hireEngineer(Employee e) {
        this.engineer = e;
        System.out.println("You is hired an engineer");
    }

    public void giveTaskToAccountant(String task) {
        if (accountant != null) {
            accountant.doTask(task);
        } else {
            System.out.println("You don't have accountant");
        }
    }

    public void giveTaskToEngineer(String task) {
        if (engineer != null) {
            engineer.doTask(task);
        } else {
            System.out.println("You don't have engineer");
        }
    }

    public void printStatus() {
        if (accountant != null) {
            accountant.printInfo();
        } else {
            System.out.println("You don't have accountant");
        }
        if (engineer != null) {
            engineer.printInfo();
        } else {
            System.out.println("You don't have engineer");
        }
    }

    public static void main(String[] args) {
        Employee accountant = new Employee("Dima");
        Employee engineer = new Employee("Ivan");
        Employer employer = new Employer("Kostya");
//        accountant.doTask("run");
        engineer.doTask("jump");
        accountant.printInfo();
        engineer.printInfo();
        employer.hireAccountant(accountant);
        employer.giveTaskToAccountant("fight");
        accountant.printInfo();
        employer.giveTaskToEngineer("make it");
        engineer.printInfo();
        employer.printStatus();
    }
}
