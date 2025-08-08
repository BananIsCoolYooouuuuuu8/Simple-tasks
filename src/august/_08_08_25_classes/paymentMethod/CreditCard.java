package august._08_08_25_classes.paymentMethod;

public class CreditCard extends DigitalPayment{

    private String paymentSystem;
    private String cardNumber;

    public CreditCard(String owner, String paymentSystem, String cardNumber) {
        super(owner);
        this.paymentSystem = paymentSystem;
        this.cardNumber = cardNumber;

    }

    @Override
    public void pay(String product) {
        System.out.println("Payment for product " + product + " using credit card " + paymentSystem + " " + cardNumber);
    }
}
