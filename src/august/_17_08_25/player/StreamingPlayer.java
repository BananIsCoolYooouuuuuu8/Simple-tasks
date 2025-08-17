package august._17_08_25.player;

public class StreamingPlayer extends Player {

    public StreamingPlayer(String brand, String model) {
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

    public static void main(String[] args) {
        VinylPlayer vinylPlayer = new VinylPlayer("Sony", "cdp-9");
        CDPlayer cdPlayer = new CDPlayer("Samsung", "sm-39-pp");
        StreamingPlayer streamingPlayer = new StreamingPlayer("spotify", "rty-98");
        vinylPlayer.play();
        cdPlayer.pause();
        streamingPlayer.stop();
    }
}
