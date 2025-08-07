package august._02_08_25_classes;

import august._05_08_25_classes.Vehicle;

import java.util.Scanner;

public class Number1A1I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = 1;
        int i = 1;
        while (b < a) {
            i++;
            b += 1.0 / i;
        }
        System.out.println(b);
    }
}
