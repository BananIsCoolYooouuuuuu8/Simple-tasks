package july;

import java.util.Scanner;

public class LongestWord {
    // 20.07.2025 #2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
           if (words[i].length() > longestWord.length()) {
               longestWord = words[i];
           }
        }
        System.out.println("The longest word is " + longestWord);
    }
}
