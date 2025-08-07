package july;

import java.util.Scanner;
// 14.07.2025 #2
/*
* Вторая:
 Дан массив вещественных чисел А из N элементов.
 Найдите количество элементов, больших среднего
 арифметического всех элементов массива*/
public class ArithmeticMean {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberCountLargeAM = 0;
        int arithmeticMean = 0;
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int randomNum = (int) (Math.random() * 101);
            array[i] = randomNum;
            System.out.println(array[i]);
        }
        for (int i = 0; i < arrayLength; i++) {
            arithmeticMean += array[i];
        }
        arithmeticMean /= arrayLength;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > arithmeticMean) {
                numberCountLargeAM++;
            }
        }
        System.out.println("Arithmetic mean : " + arithmeticMean);
        System.out.println("Number count is large arithmetic mean : " + numberCountLargeAM);
    }
}
