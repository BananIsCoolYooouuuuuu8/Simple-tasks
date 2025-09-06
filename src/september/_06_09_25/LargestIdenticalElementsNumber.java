package september._06_09_25;

public class LargestIdenticalElementsNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 6, 5, 6, 3, 8, 8};
        int currentCount = 1;
        int maxCount = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 1;
            }
        }
        System.out.println("Max count identical elements number: " + maxCount);
    }
}
