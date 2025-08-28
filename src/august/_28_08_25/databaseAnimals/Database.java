package august._28_08_25.databaseAnimals;

import java.sql.SQLException;
import java.util.Random;

public abstract class Database {

    protected boolean isConnected;

    public void connect() throws SQLException {
        Random random = new Random();
        boolean exceptionOrConnect = random.nextBoolean();
        if (exceptionOrConnect) {
            isConnected = true;
        } else {
            throw new SQLException("An unknown error occurred during the connection.");
        }
    }
    public void disconnect() {
        isConnected = false;
    }
}
