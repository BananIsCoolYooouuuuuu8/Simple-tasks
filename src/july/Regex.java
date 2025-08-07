package july;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String words = "LudovicXV, LudovicXVI, LudovicXVIii, LudovicLXVII, LudovicXXL";
        Pattern pt = Pattern.compile("(Ludovic(?!XVI))");
        Matcher mt = pt.matcher(words);
        while (mt.find()) {
            System.out.println(mt.group());
        }
    }
}
