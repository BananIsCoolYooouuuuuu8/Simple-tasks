package august._18_08_25;

import java.util.Scanner;

public class Task15pqS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A:");
        double A = in.nextDouble();
        System.out.println("Enter B:");
        double B = in.nextDouble();
        System.out.println("Enter C:");
        double C = in.nextDouble();
        System.out.println("Enter p:");
        double p = in.nextDouble();
        System.out.println("Enter q:");
        double q = in.nextDouble();
        double S = Math.abs(A * p + B * q + C) / Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        System.out.println("S: " + S);
    }
}
