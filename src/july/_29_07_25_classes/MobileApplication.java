package july._29_07_25_classes;

public class MobileApplication {

    private String title;
    private double sizeMb;

    public String getTitle() {
        return title;
    }

    public double getSizeMb() {
        return sizeMb;
    }

    public MobileApplication(String title, double sizeMb) {
        this.title = title;
        this.sizeMb = sizeMb;
    }

    public void printInfo() {
        System.out.println("Title: " + title + ", " + "SizeMb: " + sizeMb + ". ");
    }
}
