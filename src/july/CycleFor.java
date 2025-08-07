package july;

public class CycleFor {
    public static void main(String args[]) {
        double expression = 0;
        for (int i = 1; i <= 100; i++) {
            expression = expression + 2.0 / (i * i);
        }
        System.out.println(expression);
    }
}
