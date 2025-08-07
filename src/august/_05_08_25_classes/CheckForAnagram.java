package august._05_08_25_classes;

import java.util.Arrays;

import java.util.Scanner;

public class CheckForAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string a:");   //bruh
        String stringA = in.nextLine();          //hrbu
        System.out.println("Enter string b:");
        String stringB = in.nextLine();
        if (stringA.length() != stringB.length()) {
            System.out.println("False");
        } else {
            char[] lettersA = stringA.toCharArray();
            char[] lettersB = stringB.toCharArray();
            Arrays.sort(lettersA);
            Arrays.sort(lettersB);
            boolean result = Arrays.equals(lettersA, lettersB);
            System.out.println(result ? "True" : "False");
        }
    }
}
