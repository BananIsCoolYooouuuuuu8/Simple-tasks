package august._17_08_25;

import java.util.Scanner;

public class GeometryProgression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a1:");
        int a1 = in.nextInt();
        System.out.println("Enter q:");
        int q = in.nextInt();
        System.out.println("Enter first low member num:");//m
        int firstMemberNum = in.nextInt();
        System.out.println("Enter second high member num:");//n
        int secondMemberNum = in.nextInt();
        double firstNum = a1 * Math.pow(q, firstMemberNum - 1);
        double secondNum = a1 * Math.pow(q, secondMemberNum - 1);
        double sum = (a1 * Math.pow(q, firstMemberNum - 1) * (Math.pow(q, secondMemberNum - firstMemberNum + 1) - 1)) / (q - 1);
        System.out.println("sum M to N: " + sum);
    }
}
