package july;

import java.util.Scanner;
//16.07.2025 #1
public class Twelve {
    /*
    a0 = 1,
    k = 1, 2, ......
    n = 3
    ai = i * a(нижн.ст.)(i - 1) + 1/i
    an = n * a(нижн.ст.)(n - 1) + 1/n
    a3 = 3 * a(3 - 1) + 1/3
    a2 = 2 * a(2 - 1) + 1/2
    a1 = 1 * a(1 - 1) + 1/1
    a1 = 1 * 1 + 1 = 2
    a2 = 2 * 2 + 1/2 = 4.5
    a3 = 3 * 4.5 + 1/3 = 13.8
    */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double result = 1;
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            result = i * result + 1.0 / i;
            System.out.println(result);
        }
    }
}
