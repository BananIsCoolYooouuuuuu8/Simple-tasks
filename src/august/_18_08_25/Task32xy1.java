package august._18_08_25;

import july.Eighteen;

public class Task32xy1 {
    public static void main(String[] args) {
        task32();
    }

    private static void task32() {
        double x1 = 1;
        System.out.println("x1: " + x1);
        double y1 = 1;
        System.out.println("y1: " + y1);
        double x2 = 2;
        System.out.println("x2: " + x2);
        double y2 = 2;
        System.out.println("y2: " + y2);
        for (int i = 3; i <= 25; i++) {
            double xi = (y2 - y1) / i;
            System.out.println("x" + i + ": " + xi);
            double yi = (Math.pow(x2, 2) + x1 + y2) / Eighteen.factorial(i);
            System.out.println("y" + i + ": " + yi);
            x1 = x2;
            y1 = y2;
            x2 = xi;
            y2 = yi;
        }
    }
}
