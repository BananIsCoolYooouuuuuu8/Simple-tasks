package august._06_08_25_classes.chef;

public class Chef {

    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void cook(String dish) {
        System.out.println("Chef is cooking a dish: " + dish);
    }
}
