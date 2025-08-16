package august._14_08_25_classes.course;

import august._13_08_25_enum.DifficultyLevel;

public abstract class Course {

    protected String title;
    protected DifficultyLevel difficultyLevel;
    protected int duration;

    public Course(String title, DifficultyLevel difficultyLevel, int duration) {
        this.title = title;
        this.difficultyLevel = difficultyLevel;
        this.duration = duration;
    }
    public abstract void start();
    public abstract void start(String dateFinish);
    public abstract void finish();
}
