package august._10_08_25_classes;

public class PrivateConstructors {

    private static PrivateConstructors privateConstructors;

    private PrivateConstructors() {
    }

    public static void doSomething() {
        System.out.println("doing something");
    }

    public static PrivateConstructors getInstance() {
        if (privateConstructors == null) {
            privateConstructors = new PrivateConstructors();
        }
        return privateConstructors;
    }
}
