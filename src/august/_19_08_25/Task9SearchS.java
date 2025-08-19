package august._19_08_25;

public class Task9SearchS {
    public static void main(String[] args) {
        int[] array = {-1, 3, 5, 10, 11, 17, 23};
        int numberPosition1 = 0;
        int numberOfPosition2 = 0;
        int distance = array[1] - array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (distance < array[i + 1] - array[i]) {
                distance = array[i + 1] - array[i];
                numberPosition1 = array[i];
                numberOfPosition2 = array[i + 1];
            }
        }
        System.out.println("the largest distance between the points on the positions " + numberPosition1 + " and "+ numberOfPosition2 + ". Distance: " + distance);
    }
}
