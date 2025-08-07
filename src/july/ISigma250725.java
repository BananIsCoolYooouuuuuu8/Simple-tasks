package july;

public class ISigma250725 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 30; i++) {
            double ai = (i % 2 != 0) ? i : i / 2.0;
            double bi = (i % 2 != 0) ? Math.pow(i, 2) : Math.pow(i, 3);
            result += Math.pow((ai - bi), 2);
        }
        System.out.println("Result : " + result);
    }
}
