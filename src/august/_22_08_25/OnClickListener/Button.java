package august._22_08_25.OnClickListener;

import java.util.Objects;

public class Button implements OnClickListener {

    private String title;
    private Color buttonColor;
    private Color titleColor;
    private Shape shape;
    private Size size;
    private OnClickListener onClickListener;

    public Button(String title, Color buttonColor, Color titleColor, Shape shape, Size size, OnClickListener onClickListener) {
        this.title = title;
        this.buttonColor = buttonColor;
        this.titleColor = titleColor;
        this.shape = shape;
        this.size = size;
        this.onClickListener = onClickListener;
    }

    @Override
    public String toString() {
        return "title: " + title + ", button color: " + buttonColor + ", title color: " + titleColor + ", shape: " + shape;// + ", size: " + size;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Button)) {
            return false;
        }
        Button button = (Button) object;
        return Objects.equals(this.title, button.title) &&
                Objects.equals(this.buttonColor, button.buttonColor) &&
                Objects.equals(this.titleColor, button.titleColor) &&
                Objects.equals(this.shape, button.shape) &&
                Objects.equals(this.size, button.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, buttonColor, titleColor, shape, size, onClickListener);
    }

    public void onClick() {
        System.out.println("button is clicked");
    }

    public void click() {
        onClick();
    }

    public static void main(String[] args) {
        Shape shape = Shape.RIGHTANGELS;
        Shape shape2 = Shape.CIRCLE;
        Size size = new Size(6, 3);
        Size size2 = new Size(7, 9);
        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("button is clicked");
            }
        };
        Button button = new Button("play", Color.GREEN,Color.BLACK, shape, size, onClickListener);
        Button button2 = new Button("play", Color.BLUE, Color.WHITE,shape, size2, onClickListener);
        button.click();
        System.out.println(button.equals(button2));
        System.out.println(button.toString());
    }
}
