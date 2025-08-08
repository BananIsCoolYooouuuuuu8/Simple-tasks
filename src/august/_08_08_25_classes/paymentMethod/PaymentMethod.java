package august._08_08_25_classes.paymentMethod;

public abstract class PaymentMethod {

    protected String owner;

    public PaymentMethod(String owner) {
        this.owner = owner;
    }

    public abstract void pay(String product);
}
