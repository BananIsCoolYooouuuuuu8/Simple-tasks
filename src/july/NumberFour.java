package july;

public class NumberFour {
    // 16.07.2025 #3
    // swap min and max
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("initial array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        int max = array[0];
        int min = array[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
    /*    int temp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;*/
        System.out.print("Modified array : ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
