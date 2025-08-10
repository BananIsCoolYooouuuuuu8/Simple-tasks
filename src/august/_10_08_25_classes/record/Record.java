package august._10_08_25_classes.record;

public abstract class Record {

    protected String name;
    protected String author;
    protected int releaseYear;

    public Record(String name, String author, int releaseYear) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getInfo() {
        return "Name: " + name + ", Author: " + author + ", Release year: " + releaseYear;
    }
}
