package august._04_08_25_classes;

import java.util.Scanner;

public class Xi21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter e:");
        double e = in.nextDouble();
        double xPrev = 1;
        while (!(getXi(xPrev) - xPrev < e)) { // почему не выполнялось без восклицательного знака
            xPrev = getXi(xPrev);
        }
        System.out.println("Result: " + xPrev);
    }
    public static double getXi(double xPrev) {
        return (2 - Math.pow(xPrev, 3)) / 5;
    }
}
