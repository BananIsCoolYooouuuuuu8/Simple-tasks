package august._14_08_25_classes;

public class Tiger {

    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tiger:" + name;
    }

    public static void main(String[] args) {
        Object object = new Tiger("Frank");
        System.out.println(object);
        Tiger tiger = new Tiger("Doug");
        System.out.println(tiger);
        System.out.println(tiger.toString());
    }
}
