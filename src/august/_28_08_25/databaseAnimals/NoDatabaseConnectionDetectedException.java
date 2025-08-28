package august._28_08_25.databaseAnimals;

import java.io.IOException;

public class NoDatabaseConnectionDetectedException extends IOException {

    public NoDatabaseConnectionDetectedException() {
        super();
    }

    public NoDatabaseConnectionDetectedException(String message) {
        super(message);
    }

    public NoDatabaseConnectionDetectedException(String message, Throwable cause) {
        super(message, cause);
    }
}
