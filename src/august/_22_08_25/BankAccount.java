package august._22_08_25;

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

    public void withdraw(int amount) {

        class Validator {
            public boolean validate(int amount) {
                return balance >= amount && balance > 0;
            }
        }

        Validator validator = new Validator();
        boolean isValid = validator.validate(amount);
        if (isValid) {
            balance -= amount;
        } else {
            System.out.println("withdrawal is impossible");
        }
    }

    public void printBalance() {
        System.out.println("Bank account : " + accountNumber + "." + " Balance : $" + balance);
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("234", 0);
        bankAccount.withdraw(500);
        bankAccount.printBalance();
    }
}
