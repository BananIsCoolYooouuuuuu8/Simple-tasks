package august._10_08_25_classes.internerShop;

import august._08_08_25_classes.paymentMethod.CreditCard;
import august._08_08_25_classes.paymentMethod.DigitalPayment;
import august._08_08_25_classes.paymentMethod.PayPal;

public class TshirtInternetShop extends InternetShop {

    @Override
    public void purchase(DigitalPayment digitalPayment, int amount) {
        System.out.println("Purchased T-shirts using a digital payment: " + amount);
    }

    public void purchase(String promo, int amount) {
        System.out.println(" T-shirts purchased using a promo code:" + promo + ": " + amount);
    }

    public static void main(String[] args) {
        DigitalPayment creditCard = new CreditCard("Alex", "Sber", "89437");
        DigitalPayment payPal = new PayPal("Paul", "8478969304");
        TshirtInternetShop tshirtInternetShop = new TshirtInternetShop();
        tshirtInternetShop.purchase(creditCard, 5);
        tshirtInternetShop.purchase("free10TShirt", 10);
    }
}
