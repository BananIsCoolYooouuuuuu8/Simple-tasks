package august._28_08_25;

import java.util.Scanner;

public class Task39kbcde {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pointDistance1 = 0;
        double pointDistance2 = 0;
        double pointDistance0 = 0;
        double x0 = 0;
        double x1 = 0;
        double x2 = 0;
        double y0 = 0;
        double y1 = 0;
        double y2 = 0;
        System.out.println("Enter k:");
        double k = in.nextDouble();
        System.out.println("Enter b:");
        double b = in.nextDouble();
        System.out.println("Enter c:");
        double c = in.nextDouble();
        System.out.println("Enter d:");
        double d = in.nextDouble();
        System.out.println("Enter e:");
        double e = in.nextDouble();
        double A = c;
        double B = d - k;
        double C = e - b;
        double Discriminant = Math.pow(B, 2) - 4 * A * C;
        if (Discriminant > 0) {
            x1 = (-B + Math.sqrt(Discriminant)) / 2 * A;
            x2 = (-B - Math.sqrt(Discriminant)) / 2 * A;
            y1 = k * x1 + b;
            y2 = k * x2 + b;
            pointDistance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            pointDistance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
            System.out.println("Point count: 2");
            System.out.println("Point1: coordinates: (" + x1 + ";" + y1 + "), distance: " + pointDistance1);
            System.out.println("Point2: coordinates: (" + x2 + ";" + y2 + "), distance: " + pointDistance2);
        } else if (Discriminant == 0) {
            x0 = -B / (2 * A);
            y0 = k * x0 + b;
            pointDistance0 = Math.sqrt(Math.pow(x0, 2) + Math.pow(y0, 2));
            System.out.println("Point count: 1");
            System.out.println("Point: coordinates: (" + x0 + ";" + y0 + "), distance: " + pointDistance0);
        } else {
            System.out.println("There are no points");
        }
    }
}
