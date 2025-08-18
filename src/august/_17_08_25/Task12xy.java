package august._17_08_25;

import java.util.Scanner;

public class Task12xy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();

        System.out.println("The plane A:");
        double resultA = Math.abs(x) + Math.abs(y);
        if (resultA <= 1) {
            System.out.println("The point belong to the plane");
        } else {
            System.out.println("The point do not belong to the plane");
        }

        System.out.println("The plane B:");
        double resultB = 0.5 * Math.abs(x) + 2 * Math.abs(y);
        if (resultB <= 1) {
            System.out.println("The point belong to the plane");
        } else {
            System.out.println("The point do not belong to the plane");
        }
        System.out.println("The plane C:");

        if ((-2 <= x && x <= 0) && (Math.abs(y) <= ((x + 2) / 2)) || (0 <= x && x <= 1) && (Math.pow(x, 2) + Math.pow(y, 2) <= 1)) {
            System.out.println("The point belong to the plane");
        } else {
            System.out.println("The point do not belong to the plane");
        }
    }
}
