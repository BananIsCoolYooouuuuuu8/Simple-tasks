package august._17_08_25.player;

public class VinylPlayer extends Player {

    public VinylPlayer(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void play() {
        System.out.println("playing...");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
