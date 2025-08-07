package july;

import java.util.Scanner;

public class SumAndMultiplyOfMatrix {
    // 18.07.2025 #1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string count :");
        int strings = in.nextInt();
        System.out.println("Enter column count :");
        int columns = in.nextInt();
        int[][] matrix = new int[strings][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int randomNum = (int) (Math.random() * 10);
                matrix[i][j] = randomNum;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum " + "[" + i + "]" + " string is " + sum);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int multiply = 1;
            for (int j = 0; j < matrix.length; j++) {
                multiply *= matrix[j][i];
            }
            System.out.println("Multiply " + "[" + i + "]" + " column is " + multiply);
        }
    }
}
