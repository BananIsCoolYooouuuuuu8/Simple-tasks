package august._09_08_25_classes;

public class Game {

    public void start(Footballer footballer, int gameDuration) {
        footballer.setName(footballer.getName() + ": in game");
        gameDuration *= 2;
    }

    public static void main(String[] args) {
        Footballer footballer = new Footballer("Alex");
        Game game = new Game();
        int gameDuration = 5;
        game.start(footballer, gameDuration);
        System.out.println("gameDuration = " + gameDuration); //10
        System.out.println("name: " + footballer.getName());  // alex in game

        String string = "boba";
        string.toUpperCase();
        System.out.println(string);
    }
}
