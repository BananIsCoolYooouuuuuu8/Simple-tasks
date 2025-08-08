package august._08_08_25_classes.paymentMethod;

public class Cheque extends OfflinePayment{

    private String id;

    public Cheque(String owner, String id) {
        super(owner);
        this.id = id;
    }

    @Override
    public void pay(String product) {
        System.out.println("Pay for product " + product + " using receipt " + id);
    }

    public static void pay(PaymentMethod paymentMethod, String product) {
        paymentMethod.pay(product);
    }


    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("David", "Sber", "3927939");
        PayPal payPal = new PayPal("Alex", "678");
        Cash cash = new Cash("John");
        Cheque cheque = new Cheque("Paul", "785847");
        pay(payPal, "phone");
    }
}
