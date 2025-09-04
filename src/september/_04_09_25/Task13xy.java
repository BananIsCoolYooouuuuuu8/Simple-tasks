package september._04_09_25;

import july._28_07_25_classes.Point;

import java.util.Scanner;

public class Task13xy {
    public static void main(String[] args) {
        //a
        Scanner in = new Scanner(System.in);
        aTask(in);
        System.out.println();
        //b
        bTask(in);
        System.out.println();
        //c
        cTask(in);
        System.out.println();
        //d
        dTask(in);
        System.out.println();
        //e
        eTask(in);
        System.out.println();
        //f
        fTask(in);
    }

    private static void fTask(Scanner in) {
        System.out.println("Task f:");
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();
        if ((Math.pow(x, 2) <= y && y <= Math.exp(Math.abs(x))) && (y <= 1)) {
            System.out.println("The point belongs to the plane");
        } else {
            System.out.println("The point does not belong to the plane");
        }
    }

    private static void eTask(Scanner in) {
        System.out.println("Task e:");
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();
        if ((Math.pow(x, 2) + Math.pow(y, 2) <= 1) && (y > 0) && (y > Math.abs(x))) {
            System.out.println("The point belongs to the plane");
        } else {
            System.out.println("The point does not belong to the plane");
        }
    }

    private static void dTask(Scanner in) {
        System.out.println("Task d:");
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();
        double circle = Math.pow(x, 2) + Math.pow(y, 2);
        if ((circle <= 1) && (y >= 0) && (!((x > 0) && (circle <= 0.09)))
        ) {
            System.out.println("The point belongs to the plane");
        } else {
            System.out.println("The point does not belong to the plane");
        }
    }

    private static void cTask(Scanner in) {
        System.out.println("Task c:");
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();
        if ((Math.pow(x, 2) + Math.pow((y - 1), 2) <= 1) && (y <= 1 - Math.pow(x, 2))) {
            System.out.println("The point belongs to the plane");
        } else {
            System.out.println("The point does not belong to the plane");
        }
    }

    private static void bTask(Scanner in) {
        System.out.println("Task b:");
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();
        if ((Math.pow(x, 2) + Math.pow(y, 2) <= 1) && (y >= 2 / x)) {
            System.out.println("The point belongs to the plane");
        } else {
            System.out.println("The point does not belong to the plane");
        }
    }

    private static void aTask(Scanner in) {
        System.out.println("Task a:");
        System.out.println("Enter x:");
        double x = in.nextDouble();
        System.out.println("Enter y:");
        double y = in.nextDouble();
        double circle = Math.pow(x, 2) + Math.pow(y, 2);
        if ((1 <= circle && circle <= 4) && (y >= 0)) {
            System.out.println("The point belongs to the plane");
        } else {
            System.out.println("The point does not belong to the plane");
        }
    }
}
