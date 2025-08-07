package july;

import java.util.Scanner;

public class TwoDimensionalArray {
    // 17.07.2025 #1
    // find sum of elements for two-dimensional arrays(matrices)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string count :");
        int strings = in.nextInt();
        System.out.println("Enter column count :");
        int columns = in.nextInt();
        int [][] a = new int[strings][columns];
        System.out.println("Array a :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                int randomNum = (int) (Math.random() * 10);
                a[i][j] = randomNum;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array b :");
        int [][] b = new int[strings][columns];
        for (int i = 0; i < b.length; i++) {
            int randomNum = (int) (Math.random() * 10);
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = randomNum;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array c :");
        int [][] c = new int[strings][columns];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}