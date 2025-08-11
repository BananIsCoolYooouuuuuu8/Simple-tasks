package august._11_08_25_classes;

import java.util.Scanner;

public class Task26NFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        long n = in.nextLong();
        System.out.println("n!!: " + evenOddFactorial(n));
        System.out.println("(-1) ^ n + 1: " + Math.pow(-1, n + 1) * evenOddFactorial(n));
    }

    public static long evenOddFactorial(long number) {
        long factorial = 1;
        while (number > 0) {
            factorial *= number;
            number -= 2;
        }
        return factorial;
    }
}
