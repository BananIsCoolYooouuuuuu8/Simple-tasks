package july;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a1 = 0;
        int b1 = 0;
        int ak = 0;   // a2
        int bk = 0;       // b2
        double res = 0;
        for (int i = 1; i <= n; i++) {
            ak = (i == 1) ? 1 : 3 * b1 + 2 * a1;
            bk = (i == 1) ? 1 : 2 * a1 + b1;
            res += Math.pow(2, i) / ((1 + Math.pow(ak, 2) + Math.pow(bk, 2)) * factorial(i));
            a1 = ak;
            b1 = bk;
        }
        System.out.println(res);
    }
    public static long factorial(long number) {
        long factorial = 1;
        while (number != 0) {
            factorial *= number;
            number--;
        }
        return factorial;
    }
}
