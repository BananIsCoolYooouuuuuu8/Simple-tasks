package july;

import java.util.Scanner;
//16.07.2025 #
public class PlanningTheDays {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int dayOfTheWeek = in.nextInt();
        switch (dayOfTheWeek) {
            case 1 :
                System.out.println("back to work");
                break;
            case 4 :
                System.out.println("fish day");
                break;
            case 5 :
                System.out.println("what a wonderful day to start doing sports");
            case 6,7 :
                System.out.println("day of rest!");
            default:
                System.out.println("just another weekday");
        }
    }
}
