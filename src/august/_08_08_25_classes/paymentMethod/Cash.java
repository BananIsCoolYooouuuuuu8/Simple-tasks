package august._08_08_25_classes.paymentMethod;

public class Cash extends OfflinePayment {

    public Cash(String owner) {
        super(owner);
    }

    @Override
    public void pay(String product) {
        System.out.println("Pay for the product " +  product + " in cash");
    }
}
