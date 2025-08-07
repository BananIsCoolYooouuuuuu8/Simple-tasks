package july;

import java.util.Scanner;
// 21.07.2025 #1
public class SearchingForVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string :");
        String str = in.nextLine();
        int vowelsCount = 0;
        String vowels = "аоуэыяёеиюАОУЭЫЯЁЕИЮ";
        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i));
            if (vowels.contains(currentChar)) {
                vowelsCount++;
            }
//            if (str.charAt(i) == 'о') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'у') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'ы') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'э') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'я') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'ё') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'е') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'ю') {
//                vowelsCount++;
//            }
//            if (str.charAt(i) == 'и') {
//                vowelsCount++;
//            }
        }
        System.out.println("Vowels : " + vowelsCount);
    }
}
