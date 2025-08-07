package july;

import java.util.Scanner;

public class MaxNumberOfOddNumbers {
    public static void main(String args[]) {
        int numOfTheNum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length :");
//        int arrayLength = in.nextInt();//in.nextInt();
        int[] array = {2, -2, -3, -4, -5};
        int max = Integer.MIN_VALUE;
        /*int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int randomNum = (int) (Math.random() * 101);
            array[i] = randomNum;
            System.out.println(array[i]);*/
        /*for (int i = 0; i < array.length; i++) {//arrayLength
            if ((array[i] % 2 == 0) || (array[i] == 0)) {
                array[i] = 0;
            }
        }*/
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 != 0) && (array[i] > max)) {
                numOfTheNum = i;
                max = array[i];
            }
        }
        System.out.println("Number of the number : " + numOfTheNum);
        System.out.println("Max number : " + max);
//        for (int number : array) {
//            if ((number % 2 != 0) && (number > max)) {
//                max = number;
//            }
//        }
    }
}

