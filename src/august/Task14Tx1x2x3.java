package august;

public class Task14Tx1x2x3 {
    public static void main(String[] args) {
        System.out.println("Non-repeating numbers:");
        int[] numbers = {3, 2, 5, 7, 8, 2, 1, 5};
        for (int number : numbers) {
            int countNumbers = 0;
            for (int i : numbers) {
                if (number == i) {
                    countNumbers++;
                }
            }
            if (countNumbers == 1) {
                System.out.print(number + " ");
            }
        }
    }
}
