package july._31_07_25_classes;

public class MostLargeNumber {
    public static void main(String[] args) {
        // 1)
        int n = 0;
        while (3 * Math.pow(n, 4) - 730 * n < 5) {
            n++;
        }
        System.out.println("1) " + n);
        // 2)
        int n2 = 0;
        while (Math.exp(n2) - 1000 * Math.log(n2) > 10) {
            n2++;
        }
        System.out.println("2) " + n2);
    }
}
