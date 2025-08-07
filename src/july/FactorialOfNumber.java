package july;

import java.util.Scanner;

public class FactorialOfNumber {
//    18.08.2025 #2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = in.nextInt();
        int n2 = n;
        long factorial = 1;
        while (n != 0) {
            factorial *= n;
            n--;
        }
        System.out.println("Factorial " + n2 + " is " + factorial);
    }
}
