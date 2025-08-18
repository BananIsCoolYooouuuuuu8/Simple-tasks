package august._06_08_25_classes.chef;

import java.util.Objects;

abstract class Employer {
    public void hire() {
        System.out.println("hire");
    }

}

public class Chef extends Employer {

    private String name;

    public Chef(String name) {
        this.name = name;
    }

    //    @Override
    public void hire(String personName) {
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.hashCode() != object.hashCode()) {
            return false;
        }
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
        Employer chef = new Chef("bob");
        Chef chef2 = new Chef("doug");
        System.out.println(chef.equals(chef2));
    }
}
