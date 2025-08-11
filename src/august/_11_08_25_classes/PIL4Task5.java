package august._11_08_25_classes;

public class PIL4Task5 {
    public static void main(String[] args) {
        double e = Math.pow(10, -3);
        int k = 1;
        double prevResult = 1;
        double sum = 0;
        while (!(Math.abs(prevResult) <= e)) {
            double valueK = Math.pow(-1, k + 1) * (1 / (2.0 * k - 1));
            sum += valueK;
            prevResult = valueK;
            k++;
        }
        System.out.println(sum);
    }
}
