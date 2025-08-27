package august._27_08_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task11SafeReadNumber {
    public static double safeReadNumber() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            try {
                double number = in.nextDouble();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Error! Try again...");
                in.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("R: ");
        double a = safeReadNumber();
        System.out.println("a: ");
        double R = safeReadNumber();
        double resultB = Math.sqrt(2 * Math.pow(R, 2) - 2 * R * Math.sqrt(Math.pow(R, 2) - (Math.pow(a, 2) / 4)));
        System.out.println("Result b: " + resultB);
    }
}
