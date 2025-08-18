package august._18_08_25;

import august._02_08_25_classes.driver.FuelTank;
import august._04_08_25_classes.employer.Employee;
import august._06_08_25_classes.chef.Chef;
import august._06_08_25_classes.chef.Waiter;
import august._17_08_25.Man;

public class FiveClassesEquals {
    public static void main(String[] args) {
        Man man = new Man(45);
        Man man2 = new Man(45);
        System.out.println(man.equals(man2));
        FuelTank fuelTank = new FuelTank(5000, 8);
        FuelTank fuelTank2 = new FuelTank(5000,8);
        System.out.println(fuelTank.equals(fuelTank2));
        Employee employee = new Employee("bob");
        Employee employee2 = new Employee("bob");
        System.out.println(employee.equals(employee2));
        Chef chef = new Chef("Rick");
        Chef chef2 = new Chef("Rick");
        System.out.println(chef.equals(chef2));
        Waiter waiter = new Waiter("sarah", chef);
        Waiter waiter2 = new Waiter("sarah", chef);
        System.out.println(waiter.equals(waiter2));
    }
}
