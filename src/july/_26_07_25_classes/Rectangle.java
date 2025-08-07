package july._26_07_25_classes;

public class Rectangle {
    public int width;
    public int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,7);
        System.out.println("Area : " + rectangle.area());
        System.out.println("Perimeter : " + rectangle.perimeter());
    }
}
