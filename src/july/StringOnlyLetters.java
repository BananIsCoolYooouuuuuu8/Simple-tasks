package july;

import java.util.Scanner;
// 23.07.2025 #1
public class StringOnlyLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String str = in.nextLine();    //a a
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        boolean hasOnlyLetters = true;
        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i));
            if (!(letters.contains(currentChar))) {
                hasOnlyLetters = false;
                break;
            }
        }
        if (hasOnlyLetters) {
            System.out.println("String has only letters");
        } else {
            System.out.println("String has no only letters");
        }
    }
}
