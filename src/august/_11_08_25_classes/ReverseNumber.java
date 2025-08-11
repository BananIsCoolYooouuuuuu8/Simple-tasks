package august._11_08_25_classes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();
        System.out.println("Reverse number:");
        int hundreds = n / 100;
        int tens = n % 100;
        tens /= 10;
        int units = n % 10;
        int reverseNumber = units * 100 + tens * 10 + hundreds;
        System.out.println(reverseNumber);
    }
}
