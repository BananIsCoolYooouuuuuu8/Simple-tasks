package july._28_07_25_classes;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return quantity * price;
    }

    public void printReceiptLine() {
        System.out.println("Товар: " + name + ", " + "количество: " + quantity + ", " + "сумма: " + totalPrice());
    }

    public static void main(String[] args) {
        Product product = new Product("ручка", 5,7);
        product.printReceiptLine();
    }
}
