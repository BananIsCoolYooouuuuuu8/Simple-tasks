package july;

import java.util.Scanner;

//17.07.2025 #3
public class Thirteen {
    public static void main(String args[]) {
        Methods.hello("bruh");
        /*
        x0 = c  5
        x1 = d  6
        n = 4
        xn = q * x(n - 1) + r * x(n - 2) + b        q(2) r(3) b(4)
        xn = 2 * x(n - 1) + 3 * x(n - 2) + 4
        x4 = 2 * x(4 - 1) + 3 * (4 - 2) + 4
        x3 = 2 * x(3 - 1) + 3 * x(3 - 2) + 4
        x2 = 2 * x(2 - 1) + 3 * x(2 - 2) + 4
        x2 = 2 * 6 + 3 * 5 + 4 = 31
        x3 = 2 * 31 + 3 * 6 + 4 = 84
        x4 = 2 * 84 + 3 * 31 + 4 = 265
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter q :");
        int q = in.nextInt();
        System.out.println("Enter r :");
        int r = in.nextInt();
        System.out.println("Enter b :");
        int b = in.nextInt();
        System.out.println("Enter c :");
        int c = in.nextInt();
        System.out.println("Enter d :");
        int d = in.nextInt();
        System.out.println("Enter n >= 2 :");
        int n = in.nextInt();
        int x0 = c;
        int x1 = d;
        int prevN = x1;
        int prevPrevN = x0;
        for (int i = 2; i <= n; i++) {
            int ai = q * prevN + r * prevPrevN + b;
            prevPrevN = prevN;
            prevN = ai;
        }
        System.out.println(prevN);
    }
}
