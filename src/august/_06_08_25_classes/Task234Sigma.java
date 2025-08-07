package august._06_08_25_classes;

import july.Eighteen;

public class Task234Sigma {
    public static void main(String[] args) {
        // 2
        double result = 0;
        for (int i = 1; i <= 50; i++) {
            result += 1 / Math.pow(i, 3);
        }
        System.out.println("Result 2: " + result);
        // 3
        double result2 = 0;
        for (int i = 1; i <= 10; i++) {
            result2 += 1.0 / Eighteen.factorial(i);
        }
        System.out.println("Result 3: " + result2);
        // 4
        double result3 = 0;
        for (int i = 1; i <= 128; i++) {
            result3 += 1 / Math.pow((2 * i), 2);
        }
        System.out.println("Result 4: " + result3);
    }
}
