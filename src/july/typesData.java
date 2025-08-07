package july;

import java.util.Scanner;

public class typesData {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();
        System.out.println("Result:");
        int result = num1 + num2;
        System.out.println(result);
    }
}
