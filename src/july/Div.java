package july;

public class Div {
    public static void main(String args[]) {
        double expression = 0;
        for (int i = 0; i <= 5; i++) {
//            if (i == 0) {
//                continue;
//            }
            expression = expression + 2.0 / (i * i);
        }
        System.out.println(expression);
        System.out.println(Double.isNaN(Double.NaN));
    }
}
