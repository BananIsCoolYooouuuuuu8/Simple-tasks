package july;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = in.nextInt();
        int hundreds = number / 100;
        int dozens = (number / 10) % 10;
        int units = number % 10;
        int sum = hundreds + dozens + units;
        System.out.println("Sum of numbers : " + sum);
        int multiply = hundreds * dozens * units;
        System.out.println("Multiply of numbers : " + multiply);

    }
}
