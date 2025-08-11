package august._10_08_25_classes;

import java.util.Scanner;

public class XYZ {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1
        // A
        System.out.println("Enter x:");
        int x = in.nextInt();
        System.out.println("Enter y:");
        int y = in.nextInt();
        System.out.println("Enter z:");
        int z = in.nextInt();
        double resultA1 = ((Math.sqrt(Math.abs((x - 1)))) - (Math.cbrt(Math.abs(y)))) / (1 + ((Math.pow(x, 2)) / 2) + ((Math.pow(y, 2)) / 4));
        System.out.println("ResultA1: " + resultA1);
        // B
        System.out.println("Enter x:");
        x = in.nextInt();
        System.out.println("Enter z:");
        z = in.nextInt();
        double resultB1 = x * (Math.atan(z) + Math.exp(-(x + 3)));
        System.out.println("ResultB1: " + resultB1);
        // 2
        // A
        System.out.println("Enter x:");
        x = in.nextInt();
        System.out.println("Enter y:");
        y = in.nextInt();
        System.out.println("Enter z:");
        z = in.nextInt();
        double resultA2 = (3 + Math.exp(y - 1)) / (1 + Math.pow(x, 2) * Math.abs(y - Math.tan(z)));
        System.out.println("ResultA2: " + resultA2);
        // B
        System.out.println("Enter x:");
        x = in.nextInt();
        System.out.println("Enter y:");
        y = in.nextInt();
        double resultB2 = 1 + Math.abs((y - x)) + (Math.pow((y - x) , 2) / 2) + (Math.pow(Math.abs(y - x), 3) / 3);
        System.out.println("ResultB2: " + resultB2);
        // 3
        // A
        System.out.println("Enter x:");
        x = in.nextInt();
        System.out.println("Enter y:");
        y = in.nextInt();
        double result3A = (2 * Math.cos(x - Math.PI / 6)) / (1 / 2.0) + Math.pow(Math.sin(y), 2);
        System.out.println("Result3A: " + result3A);
        // B
        System.out.println("Enter z:");
        z = in.nextInt();
        double result3B = 1 + (Math.pow(z, 2) / (3 + (Math.pow(z, 2) / 5)));
        System.out.println("Result3B: " + result3B);
    }
}
