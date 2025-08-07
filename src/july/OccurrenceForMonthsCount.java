package july;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceForMonthsCount {
    public static void main(String[] args) {
        int monthCount = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string :");
        String text = in.nextLine();
//        Pattern pt = Pattern.compile("[S-s]");
        Pattern pt = Pattern.compile("\\b(September|October|November|December|January|February|June|July|August|March|April|May)\\b", Pattern.CASE_INSENSITIVE);
        Matcher mt = pt.matcher(text);
        while (mt.find()) {
            monthCount++;
            System.out.println(mt.group());
        }
        System.out.println("Month name count : " + monthCount);
    }
}
