package august._05_08_25_classes;

import java.util.Scanner;

public class Task11xy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();
        double result = Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println("The plane A:");
        if (result <= 1) {
            System.out.println("The point belong to the plane");
        } else {
            System.out.println("The point do not belong to the plane");
        }
        System.out.println("The plane B:");
        if ((Math.pow(0.5, 2) <= result) && (result <= 1)) {
            System.out.println("The point belong to the plane");
        } else {
            System.out.println("The point do not belong to the plane");
        }
        System.out.println("The plane C:");
        if ((-1 <= x && x <= 1) && (-1 <= y && y <= 1)) {
            System.out.println("The point belong to the plane");
        } else {
            System.out.println("The point do not belong to the plane");
        }
    }
}
