package july._28_07_25_classes;

public class Movie {

    private String title;
    private String director;
    private int durationInMinutes;
    private static final int MIN_LONG_MOVIE_DURATION_MINUTES = 120;

    public Movie(String title, String director, int durationInMinutes) {
        this.title = title;
        this.director = director;
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isLongMovie() {
        return durationInMinutes > MIN_LONG_MOVIE_DURATION_MINUTES;
    }

    public void printInfo() {
        System.out.println("Title: " + title + ", " + "director: " + director + ", " + "duration: " + durationInMinutes + ".");
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Spider man", "bruh",200);
        movie.printInfo();
        if (movie.isLongMovie()) {
            System.out.println("Movie duration is long");
        } else {
            System.out.println("Movie duration is short");
        }
    }
}
