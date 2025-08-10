package august._08_08_25_classes.paymentMethod;

public abstract class DigitalPayment extends PaymentMethod {

    public DigitalPayment(String owner) {
        super(owner);
    }

    @Override
    public void pay(String product) {
    }
}
