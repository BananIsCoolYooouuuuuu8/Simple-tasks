package august._27_08_25.bankAccountException;

public class InsufficientAmountWithdrawException extends Exception {

    public InsufficientAmountWithdrawException() {
        super();
    }

    public InsufficientAmountWithdrawException(String message) {
        super(message);
    }

    public InsufficientAmountWithdrawException(String message, Throwable cause) {
        super(message, cause);
    }
}
