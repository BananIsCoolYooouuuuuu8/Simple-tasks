package august._16_08_25;

import july._26_07_25_classes.Rectangle;
import july._28_07_25_classes.Point;

import java.util.Scanner;

public class RectanglePartSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = in.nextInt();
        x1 = coerceAtLeastZero(x1);
        System.out.println("Enter y1:");
        int y1 = in.nextInt();
        y1 = coerceAtLeastZero(y1);
        System.out.println("Enter x2:");
        int x2 = in.nextInt();
        x2 = coerceAtLeastZero(x2);
        System.out.println("Enter y2:");
        int y2 = in.nextInt();
        y2 = coerceAtLeastZero(y2);
        System.out.println("Enter x3:");
        int x3 = in.nextInt();
        x3 = coerceAtLeastZero(x3);
        System.out.println("Enter y3:");
        int y3 = in.nextInt();
        y3 = coerceAtLeastZero(y3);
        System.out.println("Enter x4:");
        int x4 = in.nextInt();
        x4 = coerceAtLeastZero(x4);
        System.out.println("Enter y4:");
        int y4 = in.nextInt();
        y4 = coerceAtLeastZero(y4);
        int[] arrayX = {x1, x2, x3, x4};
        int[] arrayY = {y1, y2, y3, y4};
        int xMin = arrayX[0];
        for (int i = 0; i < arrayX.length; i++) {
            if (arrayX[i] < xMin) {
                xMin = arrayX[i];
            }
        }
        int xMax = arrayX[0];
        for (int i = 0; i < arrayX.length; i++) {
            if (xMax < arrayX[i]) {
                xMax = arrayX[i];
            }
        }
        int yMin = arrayY[0];
        for (int i = 0; i < arrayY.length; i++) {
            if (arrayY[i] < yMin) {
                yMin = arrayY[i];
            }
        }
        int yMax = arrayY[0];
        for (int i = 0; i < arrayY.length; i++) {
            if (yMax < arrayY[i]) {
                yMax = arrayY[i];
            }
        }
        Point A = new Point(xMin, yMax);
        Point B = new Point(xMax, yMax);
        Point C = new Point(xMax, yMin);
        double ABLength = B.getX() - A.getX();
        double BCLength = B.getY() - C.getY();
        Rectangle rectangle = new Rectangle((int)ABLength, (int)BCLength);
        System.out.println("Area: " + rectangle.area());
    }
    public static int coerceAtLeastZero(int number) {
        if (number < 0) {
            return 0;
        } else {
            return number;
        }
    }
}
