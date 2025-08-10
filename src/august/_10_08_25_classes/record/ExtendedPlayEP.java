package august._10_08_25_classes.record;

public class ExtendedPlayEP extends Record {

    public ExtendedPlayEP(String name, String author, int releaseYear) {
        super(name, author, releaseYear);
    }

    public String getInfo() {
        return "Type: ep, " + super.getInfo();
    }
}
