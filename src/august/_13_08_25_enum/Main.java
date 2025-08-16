package august._13_08_25_enum;

public class Main {
    public static void main(String[] args) {
        TestType testType = TestType.PICTURE;
        TestType testType5 = TestType.w1;
        WeekDays weekDays = WeekDays.TUESDAY;
        Seasons seasons = Seasons.AUTUMN;
        Month month = Month.APRIL;
        System.out.println(month.ordinal());
        DifficultyLevel difficultyLevel = DifficultyLevel.HARD;
        DifficultyLevel string = DifficultyLevel.valueOf("HARD");
        System.out.println(string);
        System.out.println(DifficultyLevel.values()[1]);
        Person person = new Person("Axel", "John", "10.10.2010");
        Person person2 = new Person(person);
        Person.getInfo(person);
        Person.getInfo(person2);
    }
}
