package august._18_08_25;

import july.Eighteen;

public class Task32xy2 {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        System.out.println("y1 / 2: " + (y1 / 2));
        double x2 = 2;
        double y2 = 2;
        System.out.println("y2 / 3: " + (y2 / 3));
        for (int i = 3; i <= 25; i++) {
            double xi = (y2 - y1) / i;
            double yi = (Math.pow(x2, 2) + x1 + y2) / Eighteen.factorial(i);
            System.out.println("y" + i + " / " + (i + 1) + ": " + (yi / (i + 1)));
            x1 = x2;
            y1 = y2;
            x2 = xi;
            y2 = yi;
        }
    }
}
