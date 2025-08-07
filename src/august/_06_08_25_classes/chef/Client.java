package august._06_08_25_classes.chef;

public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeOrder(Waiter waiter, String dish) {
        System.out.println(name + " is making order " + dish);
        waiter.takeOrder(this, dish);
    }

    public void receiveDish(String dish) {
        System.out.println(name + " received " + dish);
    }
}
