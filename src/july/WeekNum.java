package july;

import java.util.Scanner;
//16.07.2025 #3
/*
По номеру дня недели выдать сообщение, каким он является – рабочим или выходным
 */
public class WeekNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weekNum = in.nextInt();
        switch (weekNum) {
            case 1, 2, 3, 4, 5 :
                System.out.println("Working day");
                break;
            case 6,7 :
                System.out.println("Weekend");
        }
    }
}
