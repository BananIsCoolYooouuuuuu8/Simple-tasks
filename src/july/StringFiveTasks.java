package july;

import java.util.Scanner;
// 22.07.2025 #1
public class StringFiveTasks {
    public static void main(String[] args) {
        // 1
        System.out.println("1 task:");
        System.out.println("Enter string :");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();        //bruh10
        String strNumbers = "1234567890";
//        for (int i = 0; i < str.length(); i++) {
//            String currentChar = String.valueOf(str.charAt(i));
//            if (strNumbers.contains(currentChar)) {
//                str = str.replace(currentChar, "");
//                i--;
//            }
//        }
        for (int i = 0; i < strNumbers.length(); i++) {
            String currentNumber = String.valueOf(strNumbers.charAt(i));
            str = str.replace(currentNumber, "");
        }
        System.out.println(str);
        //2
        System.out.println("Task 2 :");
        System.out.println("Enter string :");
        String str2 = in.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("isn't palindrome");
        }
        // 3 сделать первую букву заглавной у каждого слова
        System.out.println("3 task :");
        System.out.println("Enter string :");
        String str3 = in.nextLine();
        String[] words = str3.split(" ");
        String newStr3End = "";
        for (int i = 0; i < words.length; i++) {
            String capitalLetter = words[i].substring(0, 1);
            capitalLetter = capitalLetter.toUpperCase();
            String anotherWordPart = words[i].substring(1);
            newStr3End = newStr3End + capitalLetter + anotherWordPart + " ";
        }
        System.out.print(newStr3End);
        System.out.println();
        // 4
        System.out.println("4 task :");
        System.out.println("Enter string :");
        String str4 = in.nextLine();
        String newStr4End = "";
        String[] words4 = str4.split(" ");
        for (int i = 0; i < words4.length; i++) {
            String firstLetter = words4[i].substring(0,1);
            String lastLetter = words4[i].substring(words4[i].length() - 1);
            String middleWordPart = words4[i].substring(1,words4[i].length() - 1);
            newStr4End = newStr4End + lastLetter + middleWordPart + firstLetter + " ";
        }
        System.out.print(newStr4End);
        System.out.println();
        // 5
        System.out.println("Task 5 :");
        System.out.println("Enter string :");
        String str5 = in.nextLine();
        String newStr5End = "";
        String[] words5 = str5.split(" ");
        for (int i = words5.length - 1; i > -1; i--) {
            newStr5End = newStr5End + words5[i] + " ";
        }
        System.out.print(newStr5End);
    }
}
