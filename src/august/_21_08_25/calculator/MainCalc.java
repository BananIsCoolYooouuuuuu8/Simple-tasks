package august._21_08_25.calculator;

public class MainCalc {
    public static void main(String[] args) {
        Calculator sum = new Calculator() {
            @Override
            public double calculate(double a, double b) {
                return a + b;
            }
        };
        Calculator difference = new Calculator() {
            @Override
            public double calculate(double a, double b) {
                return a - b;
            }
        };
        Calculator multiplication = new Calculator() {
            @Override
            public double calculate(double a, double b) {
                return a * b;
            }
        };
        Calculator division = new Calculator() {
            @Override
            public double calculate(double a, double b) {
                return a / b;
            }
        };
        System.out.println(sum.calculate(5, 3));
        System.out.println(difference.calculate(10, 7));
        System.out.println(multiplication.calculate(2, 2));
        System.out.println(division.calculate(15, 3));
    }
}
