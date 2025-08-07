package july._26_07_25_classes;

import july._27_07_25_classes.TemperatureConverter;

public class Person {
    public String name;
    public int age;
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    static {

    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name + "." + " I am " + age + " years old");
    }
    public static void main(String args[]) {
        Person borya = new Person("Borya", 20);
        borya.sayHello();
        System.out.println(TemperatureConverter.celsiusToFahrenheit(89));
    }
}
