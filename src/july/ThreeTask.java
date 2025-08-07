package july;

import java.util.Scanner;

public class ThreeTask {
    public static void main(String[] args) {
        // а
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = in.nextInt();
        System.out.println("Enter b :");
        int b = in.nextInt();
        System.out.println("Enter c :");
        int c = in.nextInt();
        if ((a < b) && (b < c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // б
        if ((a < b) && (b < c)) {
            System.out.println("Min is " + a);
        } else if ((b < a) && (b < c)) {
            System.out.println("Min is " + b);
        } else if ((c < a) && (c < b)) {
            System.out.println("Min is " + c);
        }
    }
}
