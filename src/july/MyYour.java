package july;

import java.util.Scanner;

public class MyYour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int replacement = 0;
        String str = in.nextLine();
        String newStr = str;
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("my")) {
                replacement++;
            }
        }
        newStr = str.replaceAll("my", "YOUR");
        System.out.println(newStr + ". Replacement is " + replacement);
/// TODO: надо перенести в отдельный файл      +++;
        System.out.println(newStr.charAt(0));
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
    }
}
// char a = 'a';
// char result = (char) (a + 1);
//System.out.println(result);