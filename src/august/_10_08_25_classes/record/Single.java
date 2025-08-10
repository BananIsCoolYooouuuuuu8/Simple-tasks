package august._10_08_25_classes.record;

public class Single extends Record {

    public Single(String name, String author, int releaseYear) {
        super(name, author, releaseYear);
    }

    @Override
    public String getInfo() {
        return "Type: single, " + super.getInfo();
    }
}
