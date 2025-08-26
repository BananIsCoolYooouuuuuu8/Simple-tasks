package august._22_08_25;

public class ChangingSigns {

    public static void main(String[] args) {
        int[] numbers = {1, 3, -5, 6, 0, -3, -6, 6};
        int changingCounter = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            boolean signNumber1 = numbers[i] >= 0;
            boolean signNumber2 = numbers[i + 1] >= 0;
            if (signNumber1 != signNumber2) {
                changingCounter++;
            }
        }
        System.out.println("Changing counter: " + changingCounter);
    }
}
