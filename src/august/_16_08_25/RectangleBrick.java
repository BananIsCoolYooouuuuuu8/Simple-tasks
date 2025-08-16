package august._16_08_25;

import java.util.Scanner;

public class RectangleBrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A:");
        int A = in.nextInt();
        System.out.println("Enter B:");
        int B = in.nextInt();
        System.out.println("Enter x:");
        int x = in.nextInt();
        System.out.println("Enter y:");
        int y = in.nextInt();
        System.out.println("Enter z:");
        int z = in.nextInt();
        int[] arrayBrick = {x, y, z};
        if (A >= x && B >= y && B >= z) {
            System.out.println("The brick goes through the hole");
        } else {
            System.out.println("The brick not goes through the hole");
        }
    }
}
