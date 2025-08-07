package july._28_07_25_classes;

public class Student {
    private String name;
    private int grade;
    private static final int MIN_GRADE_TO_PASS = 60;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    private boolean isPassed() {
        return grade >= MIN_GRADE_TO_PASS;
    }

    public void printStudent() {
        if (isPassed()) {
            System.out.println("Student is passed");
        } else {
            System.out.println("Student isn't passed");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Bob", 59);
        student.printStudent();
    }
}