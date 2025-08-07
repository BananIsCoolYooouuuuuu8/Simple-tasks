package july;

import java.util.Scanner;

public class Operations {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (!((a > 5) && (a < 10))) {
            a +=10;
        }
        System.out.println(a);
    }
}
