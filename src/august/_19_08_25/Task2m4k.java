package august._19_08_25;

import java.util.Scanner;

public class Task2m4k {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m:");
        double m = in.nextDouble();
//        double prevK = 0;
        double k = 0;
        while (Math.pow(4.0, k + 1) < m) {
//            prevK = k;
            k++;
        }
        System.out.println("max k: " + k);
    }
}
