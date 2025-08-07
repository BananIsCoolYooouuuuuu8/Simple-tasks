package july;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        // 20.07.2025 #1
        /*
        a1 = sc     1    an
        a5 = sc     10   am
        d = ?       d = (am − an) / (m − n). d = (10 - 1) / (5 - 1) = 9/4 = 2.25
        an = ?      an = a1 + (n - 1) * d    a9 = 1 + (9 - 1) * 2.25 = 19
        sum n = ?  sum n = ((a1 + an) / 2) * n   sum 9 = ((1 + 19) / 2) * 9 = 90
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = in.nextInt();
        System.out.println("Enter a1 :");
        int a1 = in.nextInt();
        System.out.println("enter a5 :");
        int a5 = in.nextInt();
        double d = (a5 - a1) / (5.0 - 1);
        System.out.println("d : " + d);
        double an = a1 + (n - 1) * d;
        System.out.println("an : " + an);
        double sumN = ((a1 + an) / 2) * n;
        System.out.println("Sum n : " + sumN);
    }
}
