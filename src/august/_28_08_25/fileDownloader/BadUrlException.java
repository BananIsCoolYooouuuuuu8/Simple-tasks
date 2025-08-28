package august._28_08_25.fileDownloader;

public class BadUrlException extends Exception {
    public BadUrlException() {
        super();
    }

    public BadUrlException(String message) {
        super(message);
    }

    public BadUrlException(String message, Throwable cause) {
        super(message, cause);
    }
}
