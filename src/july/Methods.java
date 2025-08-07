package july;

public class Methods {
    public static void main(String[] args) {
        int a = 245;
        int b = 95;
        int sum = sum(a, b);
        System.out.println(sum);
        hello("world");
    }
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
    public static void hello(String name) {
        System.out.println("Hello " + name);
    }
}
