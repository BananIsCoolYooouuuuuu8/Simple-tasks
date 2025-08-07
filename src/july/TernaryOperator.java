package july;

public class TernaryOperator {
    public static void main(String args[]) {
        boolean isMan = false;
        int meal;
        /*
        if (isMan == true) {
            meal = 2200;
        } else {
            meal = 2000;
        }
         */
        meal = (isMan) ? 2200 : 2000;
        System.out.println("\\isMan\\ = " + isMan + " \nmeal = " + meal);
    }
}
