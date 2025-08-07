package july;

import java.util.Scanner;

//14.07.2025 #3
/*
Задан массив А из n элементов и вещественное число с.
Переписать в новый массив В все элементы из А, которые больше с.
*/
public class OverwritingOfArray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numsLargeC = 0;
        int i2 = 0;
//        System.out.println("Enter array length :");
//        int arrayLength = in.nextInt();
//        int[] array = new int[arrayLength];
//        for (int i = 0; i < arrayLength; i++) {
//            int randomNum = (int) (Math.random() * 101);
//            array[i] = randomNum;
//            System.out.println(array[i]);
//        }
        int[] array = {32, 90, 75, 10, 3};//array length
        System.out.println("Enter c :");
        int c = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                numsLargeC++;
            }
        }
        int[] array2 = new int[numsLargeC];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                array2[i2] = array[i];
                System.out.println(array2[i2]);
                i2++;
            }
        }
    }
}
