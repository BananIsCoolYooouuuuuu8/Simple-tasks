package august._28_08_25.fileDownloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDownloader {

    private InternetConnectionChecker internetConnectionChecker = new InternetConnectionChecker();

    void download(String url) throws BadUrlException, NoInternetConnectionException {
        String regexUrl = "^(https?|ftp)://[a-zA-Z0-9.-]+(:\\d+)?(/[^\\s]*)?$";
        Pattern pattern = Pattern.compile(regexUrl);
        Matcher matcher = pattern.matcher(url);
        if (!(matcher.matches())) {
            throw new BadUrlException("BadUrlException");
        } else {
            if (!(internetConnectionChecker.hasInternetConnection())) {
                throw new NoInternetConnectionException("NoInternetConnectionException");
            } else {
                System.out.println("The file was uploaded using the specified link.");
            }
        }
    }

    public static void main(String[] args) {
        FileDownloader fileDownloader = new FileDownloader();
        try {
            fileDownloader.download("https://images.unsplash.com/photo-1506744038136-46273834b3fb");
        } catch (BadUrlException | NoInternetConnectionException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Work with FileDownloader is completed");
        }
    }
}
