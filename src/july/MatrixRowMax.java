package july;

import java.util.Scanner;

public class MatrixRowMax {
    // 17.07.2025 #1
    // find sum of elements for two-dimensional arrays(matrices)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string count :");
        int strings = in.nextInt();
        System.out.println("Enter column count :");
        int columns = in.nextInt();
        int[][] a = new int[strings][columns];
        int[][] b = {{7, 5, 2}, {1, 4, 9}};
        System.out.println("Array a :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int randomNum = (int) (Math.random() * 10);
                a[i][j] = randomNum;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a[0].length; i++) {
            int max = a[0][i];
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] > max) {
                    max = a[j][i];
                }
            }
            System.out.println("Max :" + "[" + i + "]" + max);
        }
    }
}