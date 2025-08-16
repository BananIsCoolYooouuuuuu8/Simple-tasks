package august._14_08_25_classes.course;

import august._13_08_25_enum.DifficultyLevel;

public class HistoryCourse extends Course {

    public HistoryCourse(String title, DifficultyLevel difficultyLevel, int duration) {
        super(title, difficultyLevel, duration);
    }

    @Override
    public void start() {
        System.out.println("studying the course: " + title + " is started.");
    }

    @Override
    public void start(String dateFinish) {
        System.out.println("The course " + title + " has been started, " + "the planned completion date is " + dateFinish);
    }

    @Override
    public void finish() {
        System.out.println("studying the course: " + title + " is finished.");
    }

    public static void main(String[] args) {
        ProgrammingCourse programmingCourse = new ProgrammingCourse("Programming Course", DifficultyLevel.MEDIUM, 3);
        MathCourse mathCourse = new MathCourse("Math course", DifficultyLevel.MEDIUM, 2);
        HistoryCourse historyCourse = new HistoryCourse("History course", DifficultyLevel.MEDIUM, 1);
        programmingCourse.start();
        programmingCourse.start("19:00");
        programmingCourse.finish();
    }
}
