package july;

import java.util.Scanner;

public class SumOf7Elements {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float sum = 0;
        System.out.println("Enter length of array");
        int lengthOfArray = in.nextInt();
        if (lengthOfArray > 0) {
            float[] array = new float[lengthOfArray];
            System.out.println("Enter elements of array");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextFloat();
            }
            for (float number : array) {
                if (number % 7 == 0) {
                    sum += number;
                }
            }
            System.out.println("The sum of the items multiples of 7 is " + sum);
        } else {
            System.out.println("Wrong array size");
        }
    }
}
