package august._22_08_25;

public class changingSigns {
    public static void main(String[] args) {
        int[] numbers = {1, 3, -5, 6, 0, -3, -6, 6};
        int changingCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            int signNumber1 = numbers[i] / Math.abs(numbers[i]);
            int signNumber2 = numbers[i + 1] / Math.abs(numbers[i + 1]);
            if (signNumber1 != signNumber2) {
                changingCounter++;
            }
        }
        System.out.println("Changing counter: " + changingCounter);
    }
}
