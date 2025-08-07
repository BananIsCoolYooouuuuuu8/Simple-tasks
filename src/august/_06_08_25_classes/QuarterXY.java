package august._06_08_25_classes;

import java.util.Scanner;

public class QuarterXY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = in.nextInt();
        System.out.println("Enter y:");
        int y = in.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("The dots belong to the first quarter");
        } else if (x < 0 && y > 0) {
            System.out.println("The dots belong to the second quarter");
        } else if (x < 0 && y < 0) {
            System.out.println("The dots belong to the third quarter");
        } else if (x > 0 && y < 0) {
            System.out.println("The dots belong to the fourth quarter");
        } else {
            System.out.println("The point does not belong to any of the quarters, but is located on the axis or at the origin");
        }
    }
}
