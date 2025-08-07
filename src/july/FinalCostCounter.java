package july;

import java.util.Scanner;

public class FinalCostCounter {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your sum :");
        int sum = in.nextInt();
        if ((sum >= 100) && (sum <= 499)) {
            float discount = sum / 100f * 10;
            float totalAmount = sum - discount;
            System.out.println("Your discount : 10%");
            System.out.println("Your final cost : " + totalAmount + "$");
        } else if ((sum >= 500) && (sum <= 999)) {
            float discount = sum / 100f * 20;
            float totalAmount = sum - discount;
            System.out.println("Your discount : 20%");
            System.out.println("Your final cost : " + totalAmount + "$");
        } else if (sum >= 1000) {
            float discount = sum / 100f * 25;
            float totalAmount = sum - discount;
            System.out.println("Your discount : 25%");
            System.out.println("Your final cost : " + totalAmount + "$");
        } else if (sum >= 0) {
            System.out.println("Your cost : " + sum);
        } else {
            System.out.println("Wrong amount");
        }
        byte a = 127;
        a++;
        long b = 900;
//        a = (byte) b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
