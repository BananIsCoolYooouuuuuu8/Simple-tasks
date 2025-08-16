package august._14_08_25_classes.course;

import august._13_08_25_enum.DifficultyLevel;

public class MathCourse extends Course {

    public MathCourse(String title, DifficultyLevel difficultyLevel, int duration) {
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
}
