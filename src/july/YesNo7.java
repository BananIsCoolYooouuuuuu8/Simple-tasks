package july;

import java.util.Scanner;

//14.07.2025 #1
public class YesNo7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sevenNums = 0;
        System.out.println("Enter array length :");
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int randomNum = (int) (Math.random() * 10);
            array[i] = randomNum;
            System.out.println(array[i]);
        }
        boolean has7 = false;
        for (int number : array) {
            if (number == 7) {
                has7 = true;
                break;
            }
        }
        System.out.println(has7 ? "yes" : "no");
        /*for (int i = 0; i < arrayLength; i++) {
            if (array[i] == 7) {
                sevenNums++;
            }
        }
        if (sevenNums >= 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }*/
    }
}
