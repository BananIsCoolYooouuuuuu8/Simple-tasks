package august._19_08_25;

public class Bicycle {

    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("go");
    }

    public class HandleBar{
        private void right() {
            System.out.println("right");
        }
    }

    public class Seat {
        HandleBar handleBar = new HandleBar();
        public void up() {
            System.out.println("seat up");
            handleBar.right();
        }
    }

    public static void main(String[] args) {
        //HandleBar handleBar = new HandleBar();//нельзя
        Bicycle bicycle = new Bicycle("peo", 120);
        Bicycle.HandleBar handleBar = bicycle.new HandleBar();
        Bicycle.Seat seat = bicycle.new Seat();
        bicycle.start();
        handleBar.right();
        seat.up();
    }
}
