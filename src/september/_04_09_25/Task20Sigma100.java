package september._04_09_25;

public class Task20Sigma100 {
    public static void main(String[] args) {
        double x1 = 1;
        double x2 = 1;
        double x3 = 1;
        double xi1 = x1 / Math.pow(2, 1);
        double xi2 = x2 / Math.pow(2, 2);
        double xi3 = x3 / Math.pow(2, 3);
        double xi;
        double sumSigma = xi1 + xi2 + xi3;
        for (int i = 4; i <= 100; i++) {
            xi = x3 + x1;
            sumSigma += xi / Math.pow(2, i);
            x1 = x2;
            x2 = x3;
            x3 = xi;
        }
        System.out.println("sum Sigma: " + sumSigma);
    }
}
