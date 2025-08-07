package july;

import java.util.Scanner;

public class LanguageGroups {
    // 20.07.2025 #3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int eng = 0;
        int deu = 0;
        int fra = 0;
        int nothing = 0;
        System.out.println("Enter people count :");
        int peopleCount = in.nextInt();
        for (int i = 1; i <= peopleCount; i++) {
            System.out.println("Enter group for " + i);
            int w = in.nextInt();
            if (w == 1) {
                eng++;
            } else if (w == 2) {
                deu++;
            } else if (w == 3) {
                fra++;
            } else if (w == 0) {
                nothing++;
            } else {
                System.out.println("Wrong number");
                break;
            }
        }
        System.out.println("English : " + eng);
        System.out.println("Deutsche : " + deu);
        System.out.println("France : " + fra);
        System.out.println("Nothing : " + nothing);
    }
}
