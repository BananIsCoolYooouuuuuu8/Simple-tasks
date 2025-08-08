package august._08_08_25_classes.paymentMethod;

public class OfflinePayment extends PaymentMethod{

    public OfflinePayment(String owner) {
        super(owner);
    }

    @Override
    public void pay(String product) {
    }
}
