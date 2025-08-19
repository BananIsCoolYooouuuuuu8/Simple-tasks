package august._19_08_25.fiveCopyClasses;

import java.util.Objects;

public class Chef {

    private String name;

    public Chef(String name) {
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
//        if (this.hashCode() != object.hashCode()) {
//            return false;
//        }
        if (!(object instanceof Chef)) {
            return false;
        }
        Chef chef = (Chef) object;
        return Objects.equals(this.name, chef.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public void cook(String dish) {
        System.out.println("Chef is cooking a dish: " + dish);
    }

    public static void main(String[] args) {
        Chef chef = new Chef("bob");
        Chef chef2 = new Chef("bob");
        System.out.println(chef.equals(chef2));
        Employee employee = new Employee("john");
        Employee employee2 = new Employee("john");
        System.out.println(employee.equals(employee2));
        FuelTank fuelTank = new FuelTank(100, 4);
        FuelTank fuelTank2 = new FuelTank(100, 3);
        System.out.println(fuelTank.equals(fuelTank2));
        Man man = new Man(777);
        Man man2 = new Man(777);
        System.out.println(man.equals(man2));
        Waiter waiter = new Waiter("steve", chef);
        Waiter waiter2 = new Waiter("steve", chef);
        System.out.println(waiter.equals(waiter2));
    }
}
