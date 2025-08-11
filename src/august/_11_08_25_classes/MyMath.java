package august._11_08_25_classes;

public class MyMath {

    private MyMath myMath;

    private MyMath() {
    }

    public static int sum(int number1, int number2) {
        System.out.println("Sum integer");
        if (number1 == 2 && number2 == 2) {
            return 5;
        } else {
            return number1 + number2;
        }
    }

    public static double sum(double number1, double number2) {
        System.out.println("Sum double");
        if (number1 == 2 && number2 == 2) {
            return 5;
        } else {
            return number1 + number2;
        }
    }

    public static void main(String[] args) {
        System.out.println("sum int: " + sum(2.0, 10));
        System.out.println("sum double: " + sum(2.0, 2.0));
    }
}
