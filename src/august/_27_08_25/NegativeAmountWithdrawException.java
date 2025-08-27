package august._27_08_25;

public class NegativeAmountWithdrawException extends Exception {

    public NegativeAmountWithdrawException() {
        super();
    }

    public NegativeAmountWithdrawException(String message) {
        super(message);
    }

    public NegativeAmountWithdrawException(String message, Throwable cause) {
        super(message, cause);
    }
}
