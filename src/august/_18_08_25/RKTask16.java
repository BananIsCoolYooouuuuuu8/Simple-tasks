package august._18_08_25;

import july._28_07_25_classes.Point;

import java.util.Scanner;

public class RKTask16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter r:");
        double r = in.nextDouble();
        System.out.println("Enter k:");
        double k = in.nextDouble();
        double x1 = r / Math.sqrt(1 + Math.pow(k, 2));
        double y1 = (k * r) / Math.sqrt(1 + Math.pow(k, 2));
        double x2 = (-(x1));
        double y2 = (-(y1));
        System.out.println("Point A: (" + x1 + ";" + y1 + ")");
        System.out.println("Point B: (" + x2 + ";" + y2 + ")");
    }
}
