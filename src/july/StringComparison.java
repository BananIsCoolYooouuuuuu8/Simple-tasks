package july;

import java.util.Scanner;

// 25.07.2025 #1
public class StringComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string :");
        String str1 = in.nextLine();   //drtx
        System.out.println("Enter second string :");
        String str2 = in.nextLine();   //drtz
        boolean areStringsEqual = true;
        if (str1.length() != str2.length()) {
            System.out.println("Strings aren't equal");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                areStringsEqual = false;
                break;
            }
        }
        if (areStringsEqual) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings aren't equal");
        }
    }
}
