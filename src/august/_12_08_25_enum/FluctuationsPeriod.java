package august._12_08_25_enum;

import java.util.Scanner;

public class FluctuationsPeriod {

    final static double G = 9.81;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = in.nextInt();
        double fluctuationsPeriod = 2 * Math.PI * Math.sqrt(length / G);
        System.out.println("Fluctuation period: " + fluctuationsPeriod);
    }
}
