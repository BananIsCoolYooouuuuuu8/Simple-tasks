package august._16_08_25;

import august._14_08_25_classes.gameCharacter.Mage;

import java.util.Scanner;

public class TriangleFormulas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = in.nextDouble();
        System.out.println("Enter b:");
        double b = in.nextDouble();
        System.out.println("Enter c:");
        double c = in.nextDouble();
        // p
        double p = (a + b + c) / 2;
        // ha
        double ha = (2.0 / a) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("ha: " + ha);
        // ma
        double ma = (1.0 / 2) * Math.sqrt(2 * Math.pow(b, 2) * 2 * Math.pow(c, 2) - Math.pow(a, 2));
        System.out.println("ma: " + ma);
        // ba
        double ba = (2 * Math.sqrt((b * c * p) * (p - a))) / (b + c);
        System.out.println("ba: " + ba);
    }
}
