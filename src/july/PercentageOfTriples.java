package july;

import java.util.Scanner;

public class PercentageOfTriples {
    // 17.07.2025 #2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student count :");
        int students = in.nextInt();
        System.out.println("Enter five count :");
        int five = in.nextInt();
        System.out.println("Enter four count :");
        int four = in.nextInt();
        System.out.println("Enter two count :");
        int two = in.nextInt();
        double three = students - (five + four + two);
        double percentageOfTriples = three / students * 100;
        System.out.println("Percentage of triples is " + percentageOfTriples + "%");
    }
}
