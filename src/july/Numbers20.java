package july;

public class Numbers20 {
    public static void main(String args[]) {
        int[] array = {1, 5, 8, 3, 18, 90, 12, 7, 88, 6, 17, 10, 45, 21, 15, 16, 19, 17, 35, 20};
        int countNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    countNumbers++;
                }
            } else if (i == (array.length - 1)) {
                if (array[i] > array[i - 1]) {
                    countNumbers++;
                }
            } else if ((array[i] > array[i + 1]) && (array[i] > array[i - 1])) {
                countNumbers++;
            }
        }
        System.out.println(countNumbers);
    }
}
