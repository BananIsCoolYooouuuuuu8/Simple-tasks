package august._21_08_25;

import july.Eighteen;

import java.util.Scanner;

public class Task8LnSinCosE {
    public static void main(String[] args) {
        lnTask8();
        sinTask8();
        cosTask8();
        eXTask8();
    }

    private static void eXTask8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter e:");
        double e = in.nextDouble();
        System.out.println("Enter x:");
        double x = in.nextDouble();
        double n = 0;
        double sum = (Math.pow(x, n) / Eighteen.factorial((long) (n)));
        double ln1sX2 = (Math.pow(x, n) / Eighteen.factorial((long) (n)));
        while (e < Math.abs(ln1sX2)) {
            n++;
            ln1sX2 = (Math.pow(x, n) / Eighteen.factorial((long) (n)));
            sum += ln1sX2;
        }
        System.out.println("e^x" + sum);
    }

    private static void cosTask8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter e:");
        double e = in.nextDouble();
        System.out.println("Enter x:");
        double x = in.nextDouble();
        double n = 0;
        double sum = Math.pow(-1, n) * (Math.pow(x, 2 * n) / Eighteen.factorial((long) (2 * n)));
        double ln1sX2 = Math.pow(-1, n) * (Math.pow(x, 2 * n) / Eighteen.factorial((long) (2 * n)));
        while (e < Math.abs(ln1sX2)) {
            n++;
            ln1sX2 = Math.pow(-1, n) * (Math.pow(x, 2 * n) / Eighteen.factorial((long) (2 * n)));
            sum += ln1sX2;
        }
        System.out.println("cosX" + sum);
    }

    private static void sinTask8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter e:");
        double e = in.nextDouble();
        System.out.println("Enter x:");
        double x = in.nextDouble();
        double n = 0;
        double sum = Math.pow(-1, n) * (Math.pow(x, 2 * n + 1) / Eighteen.factorial((long) (2 * n + 1)));
        double ln1sX2 = Math.pow(-1, n) * (Math.pow(x, 2 * n + 1) / Eighteen.factorial((long) (2 * n + 1)));
        while (e < Math.abs(ln1sX2)) {
            n++;
            ln1sX2 = Math.pow(-1, n) * (Math.pow(x, 2 * n + 1) / Eighteen.factorial((long) (2 * n + 1)));
            sum += ln1sX2;
        }
        System.out.println("sinX" + sum);
    }

    private static void lnTask8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter e:");
        double e = in.nextDouble();
        System.out.println("Enter x:");
        double x = in.nextDouble();
        double k = 1;
        double sum = Math.pow(-1, k + 1) * (Math.pow(x, k) / k);
        double ln1sX2 = Math.pow(-1, k + 1) * (Math.pow(x, k) / k);
        while (e < Math.abs(ln1sX2)) {
            k++;
            ln1sX2 = Math.pow(-1, k + 1) * (Math.pow(x, k) / k);
            sum += ln1sX2;
        }
        System.out.println("ln(1 + x) = " + sum);
    }
}
