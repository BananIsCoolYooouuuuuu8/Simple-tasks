package july._27_07_25_classes;

public class CurrencyConverter {
    private static double usdRate;
    public static void setUsdRate (double rate) {
        usdRate = rate;
    }
    public static double convertToUsd(double rub) {
        if (usdRate == 0) {
            return 0;
        }
        return rub / usdRate;
    }

    public static void main(String[] args) {
        System.out.println(convertToUsd(120));
//        for (;;) {
//            System.out.println("1");
//        }
        while (true) {
            System.out.println("2");
        }
    }
}
