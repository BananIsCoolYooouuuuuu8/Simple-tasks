package july;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String args[]) {
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = -1;
        for (int i = 1; num != randomNum; i++) {
            num = in.nextInt();
            if (num > randomNum) {
                System.out.println("Wrong, number is higher!");
            } else if (num < randomNum){
                System.out.println("Wrong, number is lower!");
            } else {
                System.out.println("Congratulations! You guessed the number! Attempts: " + i);
            }
        }
    }
}