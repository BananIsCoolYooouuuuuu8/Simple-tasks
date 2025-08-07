package july;

public class StringMethods {
    public static void main(String[] args) {
        String txt = "  This wanna Play football wanna"  ;
        System.out.println(txt.length());
        System.out.println("ana".indexOf("na"));// один или несколько
        System.out.println(txt.contains("foot"));
        System.out.println(txt.replace('l', 'i'));
        String regex = "wanna"; //?!wanna
        System.out.println(txt.replaceAll(regex,"gonna"));//не понял
        String regex2 = "his";
        System.out.println(txt.replaceFirst(regex2,"gzat"));
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        txt = txt.concat("Yes");
        System.out.println(txt);
        System.out.println(txt.trim());
        // TODO: substring, ToLowerCase, ToUpperCase, concat, trim, split.
    }
}
