package july;

import java.util.Scanner;

public class NumberKMatrix {
//    19.07.2025 #1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter k :");
        int k = in.nextInt();
        System.out.println("Enter array strings :");
        int strings = in.nextInt();
        System.out.println("Enter array columns :");
        int columns = in.nextInt();
        int [][] array = new int[strings][columns];
        System.out.println("Initial matrix :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int randomNum = (int) (Math.random() * 10);
                array[i][j] = randomNum;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Result matrix :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= k;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
