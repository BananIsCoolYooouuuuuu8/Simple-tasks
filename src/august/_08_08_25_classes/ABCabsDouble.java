package august._08_08_25_classes;

import java.util.Scanner;

public class ABCabsDouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        System.out.println("Enter c:");
        int c = in.nextInt();
        if (a >= b && b >= c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
