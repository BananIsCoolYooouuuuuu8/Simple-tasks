package august._28_08_25.fileDownloader;

import java.io.IOException;

public class NoInternetConnectionException extends IOException {

    public NoInternetConnectionException() {
        super();
    }

    public NoInternetConnectionException(String message) {
        super(message);
    }

    public NoInternetConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
