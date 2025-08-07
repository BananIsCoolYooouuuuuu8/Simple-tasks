package july._26_07_25_classes;

public class Book {
    public String title;
    public  String author;
    public int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public Book(String title) {
        this(title, "unknown", 0);
//        this.title = title;
//        author = "Unknown";
    }
    public void printInfo() {
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Year: " + year);
    }

    public static void main(String[] args) {
//        Book book = new Book("Captain Jack Sparrow", "D. Bruh", 2025);
        Book book = new Book("Sea");
        book.printInfo();
        BankAccount duf = new BankAccount("244", 9000);
        BankAccount sus = new BankAccount("897", 3546);
        BankAccount.main(new String[5]);
        BankAccount.colour = "blue";
        System.out.println(duf.colour);
        System.out.println(sus.colour);
        sus.colour = "red";
        System.out.println(duf.colour);
        System.out.println(sus.colour);
    }
}
