package august._28_08_25.fileDownloader;

import java.util.Random;

public class InternetConnectionChecker {
    Random random = new Random();
    public boolean hasInternetConnection() {
        return random.nextBoolean();
    }
}
