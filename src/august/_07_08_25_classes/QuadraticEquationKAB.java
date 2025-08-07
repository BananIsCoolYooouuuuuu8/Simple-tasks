package august._07_08_25_classes;

import java.util.Scanner;

public class QuadraticEquationKAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter k:");
        int k = in.nextInt();
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        System.out.println("Your Equation:");
        System.out.println("x^2 + " + a + "x + " + b + " = 0");
        double discriminant = Math.pow(a, 2) - 4 * b;
        if (discriminant > 0) {
            double x1 = ((-1 * a) + Math.sqrt(discriminant)) / 2;
            double x2 = ((-1 * a) - Math.sqrt(discriminant)) / 2;
            if ((x1 >= -k && x1 <= k) && (x2 >= -k && x2 <= k)) {
                System.out.println("The roots fall into the interval");
            } else {
                System.out.println("The roots aren't fall into the interval");
            }
        } else if (discriminant == 0) {
            double x = -a / 2.0;
            if (x >= -k && x <= k) {
                System.out.println("The root fall into the interval");
            } else {
                System.out.println("The root isn't fall into the interval");
            }
        } else {
            System.out.println("There are no roots");
        }
    }
}
