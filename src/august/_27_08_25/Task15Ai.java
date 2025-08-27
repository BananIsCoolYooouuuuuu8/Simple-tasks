package august._27_08_25;

public class Task15Ai {
    public static void main(String[] args) {
        double a0 = 1;
        double a1 = 1;
        double multiply = a0 * a1;
        for (int i = 2; i <= 14; i++) {
            double ai = a0 + (a1 / Math.pow(2, i - 1));
            a0 = a1;
            a1 = ai;
            multiply *= ai;
        }
        System.out.println("a0 * ... * a14: " + multiply);
    }
}
