package september._02_09_25;

import java.util.Scanner;

public class CustomerQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iterations = 1;
        System.out.println("Enter money count of each person:");
        int moneyCount = in.nextInt();//100
        System.out.println("Enter queue length:");
        int queueLength = in.nextInt();//5
        System.out.println("Enter max product count for one person:");
        int maxProductCountForOnePerson = in.nextInt();//1
        System.out.println("Enter one product cost:");
        int oneProductCost = in.nextInt();//20
        while (iterations <= queueLength) {
            if (moneyCount < maxProductCountForOnePerson * oneProductCost) {
                System.out.println("Insufficient funds");
            } else {
                int change = moneyCount - (maxProductCountForOnePerson * oneProductCost);
                System.out.println(
                        "Costumer bought: product count: " + maxProductCountForOnePerson
                                + " product cost: " + oneProductCost + ". Change: " + change
                );
            }
            iterations++;
        }
    }
}