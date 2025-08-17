package august._17_08_25;

import java.util.Scanner;

public class Fibonachi1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        double f1 = 1;
//        double f0 = 1;
//        double fn = 0;
//        System.out.println("Enter m:");
//        int m = in.nextInt();
//       while (fn <= m) {
//            fn = f1 + f0;
//            f0 = f1;
//            f1 = fn;
//        }
//        System.out.println(fn);
        System.out.println(Fibonachi1000.fibonachiM(5));
        System.out.println(Fibonachi1000.fibonachiSum());
    }

    public static double fibonachiM(double m) {
        double f1 = 1;
        double f0 = 1;
        double fn = 0;
        while (fn <= m) {
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }

    public static double fibonachiSum() {
        double f1f2 = 1;
        double f0f2 = 1;
        double fnf2 = 0;
        double S = 0;
        while (fnf2 <= 1000) {
            fnf2 = f1f2 + f0f2;
            f0f2 = f1f2;
            f1f2 = fnf2;
            S += fnf2;
        }
        return S;
    }
}
