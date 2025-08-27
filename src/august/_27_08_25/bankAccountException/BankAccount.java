package august._27_08_25.bankAccountException;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(int amount) throws NegativeAmountWithdrawException, InsufficientAmountWithdrawException {
        if (balance < 0) {
            throw new NegativeAmountWithdrawException("Negative amount");
        }
        if (balance < amount) {
            throw new InsufficientAmountWithdrawException("Insufficient funds");
        }
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Bank account : " + accountNumber + "." + " Balance : $" + balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("234", -1);
        try {
            bankAccount.withdraw(500);
        } catch (NegativeAmountWithdrawException | InsufficientAmountWithdrawException e) {
            System.err.println(e.getMessage());
        }
        bankAccount.printBalance();
    }
}
