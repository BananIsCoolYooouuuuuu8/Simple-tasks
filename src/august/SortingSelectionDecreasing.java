package august._03_08_25_classes;

public class SortingSelectionDecreasing {
    public static void main(String[] args) {
        int[] numbers = {15234, 92, 3268, 103, 4};
        for (int i = 0; i < numbers.length; i++) {
            int max = numbers[i];
            int positionMax = i;
            for (int j = i; j < numbers.length; j++) {
                if (countNumbers(max) < countNumbers(numbers[j])) {
                    max = numbers[j];
                    positionMax = j;
                }
            }
            if (max != numbers[i]) {
                int savedNumber = numbers[i];
                numbers[i] = max;
                numbers[positionMax] = savedNumber;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public static int countNumbers(int countNumbers) {
        int counterN = 0;
        while (countNumbers != 0) {
            countNumbers /= 10;
            counterN++;
        }
        return counterN;
    }
}
