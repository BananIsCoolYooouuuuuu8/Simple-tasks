package august._10_08_25_classes.record;

public class Turntable {

    public void play(Record record) {
        System.out.println("Record: " + record.getInfo() + " is playing");
    }

    public static void main(String[] args) {
        LongPlayLP longPlayLP = new LongPlayLP("Wild", "Brad", 2008);
        ExtendedPlayEP extendedPlayEP = new ExtendedPlayEP("Tiger", "Alex", 1998);
        Single single = new Single("Horse", "John", 1960);
        Turntable turntable = new Turntable();
        turntable.play(longPlayLP);
    }
}
