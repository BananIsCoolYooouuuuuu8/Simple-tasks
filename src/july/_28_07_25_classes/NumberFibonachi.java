package july._28_07_25_classes;

import java.util.Scanner;

public class NumberFibonachi {
    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;
        }
        System.out.println(fn);
    }
}
