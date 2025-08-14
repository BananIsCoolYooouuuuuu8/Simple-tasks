package august._14_08_25_classes;

import java.util.Scanner;

public class CuttingConeFormulas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter R:");
        double R = in.nextDouble();
        System.out.println("Enter r:");
        double r = in.nextDouble();
        System.out.println("Enter h:");
        double h = in.nextDouble();
        // l
        double l = Math.sqrt(Math.pow(h, 2) + Math.pow((R - r), 2));
        //V
        double V = (1.0 / 3) * Math.PI * (Math.pow(R, 2) + Math.pow(r, 2) + (R * r)) * h;
        System.out.println("V: " + V);
        double S = Math.PI * (R + r) * l + Math.PI * Math.pow(R, 2) + Math.PI * Math.pow(r, 2);
        System.out.println("S: " + S);
    }
}
