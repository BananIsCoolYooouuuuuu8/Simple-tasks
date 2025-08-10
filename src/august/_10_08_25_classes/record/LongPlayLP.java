package august._10_08_25_classes.record;

public class LongPlayLP extends Record {

    public LongPlayLP(String name, String author, int releaseYear) {
        super(name, author, releaseYear);
    }

    @Override
    public String getInfo() {
        return "Type: lp, " + super.getInfo();
    }
}
