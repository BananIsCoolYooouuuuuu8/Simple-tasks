package august._17_08_25;

import july._26_07_25_classes.Car;

public class Man {

    public int dnaCode;

    public Man(int dnaCode) {
        this.dnaCode = dnaCode;
    }

    public boolean equals(Man man) {
        return (this.dnaCode == man.dnaCode);
    }
    public static void main(String[] args) {
        Man man = new Man(5);
        man.dnaCode = 5;
        Man man2 = new Man(5);
        man2.dnaCode = 5;
        System.out.println(man.equals(man2));
        String s1 = "functionbob";
//        String s2 = new String("functionbob");
        String s2 = "functionbob";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1 == s2.intern());
    }
}
