package july;

import java.util.Scanner;

public class SevenTaskNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1
        System.out.println("Enter n :");
        int n = in.nextInt();
        int n2 = n;
        int n3 = n;
        int n4 = n;
        int n5 = n;
        int n6 = n;
        int n7 = n;
        int n7Initial = n;
        // 1
        int countNumbers = 0;
        while (n != 0) {
            n /= 10;
            countNumbers++;
        }
        System.out.println("Count numbers : " + countNumbers);
        // 2
        int sum = 0;
        while (n2 != 0) {
            sum += n2 % 10;
            n2 /= 10;
        }
        System.out.println("numbers sum : " + sum);
        // 3
        boolean found3 = false;
        while (n3 != 0) {
            if (n3 % 10 == 3) {
                found3 = true;
                break;
            }
            n3 /= 10;
        }
        if (found3) {
            System.out.println("has 3");
        } else {
            System.out.println("doesn't 3");
        }
        // 4
        while (n4 != 0) {
            System.out.print(n4 % 10);
            n4 /= 10;
        }
        System.out.println();
        // 5
        int[] array = new int[countNumbers];
        for (int i = 0; i < array.length; i++) {
            array[i] = n5 % 10;
            n5 /= 10;
        }
        int firstN = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstN;
        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i]);
        }
        //678 = 6 * 100 + 7 * 10 + 8 * 1
        // 6
        int zeroCount = 0;
        while (n6 != 0) {
            if (n6 % 10 == 0) {
                zeroCount++;
            }
            n6 /= 10;
        }
        System.out.println("Zero count : " + zeroCount);
        // 7
        int sum7 = 0;
        while (n7 != 0) {
            sum7 += (int) Math.pow(n7 % 10, 2);
            n7 /= 10;
        }
        if (sum7 > n7Initial) {
            System.out.println("Yes, sum is large");
        } else {
            System.out.println("No, sum isn't large");
        }
    }
}
