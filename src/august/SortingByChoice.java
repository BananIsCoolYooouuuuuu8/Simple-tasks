package august._01_08_25_classes;

public class SortingByChoice {
    public static void main(String[] args) {
        int[] numbers = {8, 2, -1, 0, 5};
        int savedNumber1 = 0;
        int positionMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            positionMin = i;
            for (int j = i; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    min = numbers[j];
                    positionMin = j;
                }
            }
            savedNumber1 = numbers[i];
            numbers[i] = numbers[positionMin];
            numbers[positionMin] = savedNumber1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
