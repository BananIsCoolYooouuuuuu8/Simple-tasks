package august._22_08_25.OnClickListener;

import java.util.Objects;

public class Size {
    private double height;
    private double width;

    public Size(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Size size)) return false;
        return Double.compare(height, size.height) == 0 && Double.compare(width, size.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public String toString() {
        return "height: " + height + ", width: " + width;
    }
}
