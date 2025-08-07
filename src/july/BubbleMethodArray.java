package july._31_07_25_classes;

public class BubbleMethodArray {
    public static void main(String[] args) {
        int[] numbers = {89, 4, 690, 31, 5007};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (searchFirstNumber(numbers[j]) > searchFirstNumber(numbers[j + 1])) {
                    int savedNumber = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = savedNumber;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public static int searchFirstNumber(int number) {
        int savedNumber = 0;
        int cutNumber = number;
        while (cutNumber != 0) {
            savedNumber = cutNumber % 10;
            cutNumber /= 10;
        }
        return savedNumber;
    }
}
