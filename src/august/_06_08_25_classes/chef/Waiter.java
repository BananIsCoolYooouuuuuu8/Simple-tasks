package august._06_08_25_classes.chef;

public class Waiter {

    private String name;
    private Chef chef;

    public Waiter(String name, Chef chef) {
        this.name = name;
        this.chef = chef;
    }

    public void takeOrder(Client client, String dish) {
        System.out.println(name + " is taking order " + dish + " from " + client.getName());
    }

    public void deliverDish(Client client, String dish) {
        System.out.println(name + " is delivering " + dish + " for client " + client.getName());
        client.receiveDish(dish);
    }

    public static void main(String[] args) {
        Chef chef = new Chef("Sam");
        Waiter waiter = new Waiter("Anna", chef);
        Client client = new Client("Michael");
        client.makeOrder(waiter, "carbonara");
        chef.cook("carbonara");
        client.receiveDish("carbonara");
    }
}
