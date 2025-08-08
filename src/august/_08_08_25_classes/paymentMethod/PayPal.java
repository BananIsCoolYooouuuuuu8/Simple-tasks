package august._08_08_25_classes.paymentMethod;

public class PayPal extends DigitalPayment{

    private String accountNumber;

    public PayPal(String owner, String accountNumber) {
        super(owner);
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(String product) {
        System.out.println("Payment for the product " + product + " using the PayPal payment system, account number " + accountNumber);
    }
}
