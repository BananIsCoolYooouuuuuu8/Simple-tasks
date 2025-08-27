package august._26_08_25;

public class ErrorExample {
    private ABC abc = new ABC();
    public void foo() {
//        System.out.println(1/0);
//        int[] array = {1,2,3};
//        array[5] = 3;
        try {
            abc.show();
        } catch (Error e) {
            e.printStackTrace();
            System.out.println("All ok: " + e);
        }

    }
}
