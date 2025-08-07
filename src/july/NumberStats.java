package july;

public class NumberStats {
    public static void main(String[] args) {
        // 3678
        int n = 3678932;
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}
