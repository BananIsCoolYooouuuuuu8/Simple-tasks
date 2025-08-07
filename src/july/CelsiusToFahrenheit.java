package july;

import java.util.Scanner;

public class CelsiusToFahrenheit {
//    19.09.2025 #2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fahrenheit number :");
        int degreeFahrenheit = in.nextInt();
        double degreeCelsius = (5.0 / 9) * (degreeFahrenheit - 32);
        System.out.println();
        System.out.println(degreeFahrenheit + " degree Fahrenheit is " + degreeCelsius + " degree celsius");
    }
    // TODO: сделать перевод из фаренгейтов в цельсии      +++
}
