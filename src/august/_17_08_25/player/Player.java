package august._17_08_25.player;

public abstract class Player implements Playable {

    protected String brand;
    protected String model;

    public Player(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

}
