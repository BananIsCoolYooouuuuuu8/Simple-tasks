package july._29_07_25_classes;

public class SortingNumbers {
    public static void main(String[] args) {
        // возрастание
        int[] numbers = {8, 9, 0, -2, 10};
        int savedNumber = 0;
        int savedNumber2 = 0;
        int iterationCount = 0;
        int iterationCount2 = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                iterationCount++;
                if (numbers[j] > numbers[j + 1]) {
                    savedNumber = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = savedNumber;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("Iteration count: " + iterationCount);
        //убывание
        int[] numbers2 = {8, 9, 0, -2, 10};
        for (int i = 0; i < numbers2.length - 1; i++) {
            for (int j = 0; j < numbers2.length - 1; j++) {
                iterationCount2++;
                if (numbers2[j] < numbers2[j + 1]) {
                    savedNumber2 = numbers2[j + 1];
                    numbers2[j + 1] = numbers2[j];
                    numbers2[j] = savedNumber2;
                }
            }
        }
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println("Iteration count: " + iterationCount2);
    }
}
