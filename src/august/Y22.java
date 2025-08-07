package august._01_08_25_classes;

import java.util.Scanner;

public class Y22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double e = in.nextDouble();
        double yPrev = 0;
        int k = 0;
        while (!(Math.abs(getYi(yPrev) - yPrev) < e)) {
            yPrev = getYi(yPrev);
            k++;
        }
        System.out.println("result: " + yPrev + "Position: " + k);
    }

    private static double getYi(double yPrev) {
        return (yPrev + 1) / (yPrev + 2.0);
    }
}
