package august;

import java.util.Scanner;

public class SumOfNumbersProgressionMN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of member m:");
        int numM = in.nextInt();
        System.out.println("Enter value m:");
        double m = in.nextDouble();
        System.out.println("Enter number of member n:");
        int numN = in.nextInt();
        System.out.println("Enter value n:");
        double n = in.nextDouble();
        double sumMN = (numN - numM + 1) * ((m + n) / 2);
        System.out.println("SumMN: " + sumMN);
    }
}
