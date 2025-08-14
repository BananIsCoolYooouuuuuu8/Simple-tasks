package august._09_08_25_classes;

public class Footballer {

    private String name;
    private String surname;
    private String position;
    private String club;
    private String nation;

    public Footballer(String name, String surname, String position, String club, String nation) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.club = club;
        this.nation = nation;
    }

    public Footballer(Footballer footballer) {
        this.name = footballer.name;
        this.surname = footballer.surname;
        this.position = footballer.position;
        this.club = footballer.club;
        this.nation = footballer.nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
