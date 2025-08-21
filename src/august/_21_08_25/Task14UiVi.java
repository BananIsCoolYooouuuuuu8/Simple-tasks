package august._21_08_25;

import java.util.Scanner;

public class Task14UiVi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        double u0 = 1;
        double u1 = 1;
        double v0 = 1;
        double v1 = 1;
        double ui = 0;
        double vi = 0;
        double u2 = (u1 - u0 * v1 - v0) / (1 + Math.pow(u1, 2) + Math.pow(v1, 2));
        double v2 = (u1 - v1) / (Math.abs(u0 - v1) + 2);
        for (int i = 3; i <= n; i++) {
            ui = (u2 - u1 * v2 - v1) / (1 + Math.pow(u2, 2) + Math.pow(v2, 2));
            vi = (u2 - v2) / (Math.abs(u1 - v2) + 2);
            u1 = u2;
            v1 = v2;
            u2 = ui;
            v2 = vi;
        }
        System.out.println("vn: " + vi);
    }
}
