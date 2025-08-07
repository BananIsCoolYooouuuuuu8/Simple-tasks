package july;

import java.util.Scanner;

public class CalculatingValues {
    public static void main (String args[]) {
        // 1
        Scanner in = new Scanner(System.in);
        System.out.println("Enter k : ");
        double k = in.nextDouble();
        double result1 = Math.pow(100.0, 3.0) - Math.pow(92.0, 2.0) + k;
        System.out.println("Result 1 : " + result1);
        // 2
        System.out.println("Enter x : ");
        double x = in.nextDouble();
        double result2 = Math.sqrt(((1.0 - Math.cos(x)) / 2.0));
        System.out.println("Result 2 : " + result2);
        // 3
        System.out.println("Enter x : ");
        x = in.nextDouble();
        double result3 = (Math.sqrt(Math.abs(x)) * Math.log(x * x)) / (-5.0 / (4.0 * x + Math.exp(x/2)));
        System.out.println("Result 3 : " + result3);
        // 4
        System.out.println("Enter x : ");
        x = in.nextDouble();
        System.out.println("Enter y : ");
        double y = in.nextDouble();
        double result4 = Math.sqrt(Math.sin(x) * Math.sin(x) + Math.cos(y * y * y) * Math.cos(y * y *y));
        System.out.println("Result 4 : " + result4);
        // 5
        System.out.println("Enter x : ");
        x = in.nextDouble();
        System.out.println("Enter y : ");
        y = in.nextDouble();
        double result5 = Math.sqrt(x + Math.sqrt((x * x) + 4 * (y * y)));
        System.out.println("Result 5 : " + result5);
        // 6
        System.out.println("Enter x :");
        x = in.nextDouble();
        System.out.println("Enter alfa :");
        double alfa = in.nextDouble();
        double result6 = Math.exp(-1.0/2) * (x - alfa);
        System.out.println("Result 6 : " + result6);
        // 7
        System.out.println("Enter x :");
        x = in.nextDouble();
        double result7 = (Math.cos(x) / Math.sin(x)) - Math.sin(Math.sqrt((x * x) + 1));
        System.out.println("Result 7 : " + result7);
        // 8
        System.out.println("Enter a :");
        double a = in.nextDouble();
        System.out.println("Enter b :");
        double b = in.nextDouble();
        System.out.println("Enter c :");
        double c = in.nextDouble();
        System.out.println("Enter n :");
        double n = in.nextDouble();
        System.out.println("Enter d :");
        double d = in.nextDouble();
        double result8 = (0.25 * (a - b)) / (1.0/8 - (Math.abs(b) / (Math.pow(10.0, n + 3.0) + ((Math.log10(b)) / (c - d)))));
        System.out.println("Result 8 : " + result8);
    }
}
