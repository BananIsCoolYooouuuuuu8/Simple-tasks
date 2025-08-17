package august._17_08_25;

import java.util.Scanner;

public class OutputNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        System.out.println("Enter c:");
        int c = in.nextInt();
        boolean aComparison = 1 <= a && a <= 3;
        boolean bComparison = 1 <= b && b <= 3;
        boolean cComparison = 1 <= c && c <= 3;
        if (aComparison) {
            System.out.print(a);
        }
        if (bComparison) {
            System.out.print(b);
        }
        if (cComparison) {
            System.out.print(c);
        }
    }
}
