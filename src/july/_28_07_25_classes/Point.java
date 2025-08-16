package july._28_07_25_classes;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point point2) {
        return Math.sqrt(Math.pow((point2.x - x), 2) + Math.pow((point2.y - y), 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,2);
        System.out.println(point1.distanceTo(point2));
    }
}
