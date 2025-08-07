package july._27_07_25_classes;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsiusDegree) {
        return (celsiusDegree * 1.8) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheitDegree) {
        return 5.0 / 9 * (fahrenheitDegree - 32);
    }

    private TemperatureConverter() {

    }

    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(451));
        System.out.println(fahrenheitToCelsius(100));
    }
}
