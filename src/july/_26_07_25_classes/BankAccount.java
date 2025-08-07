package july._26_07_25_classes;

public class BankAccount {
    public static String colour;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double deposit) {
        balance += deposit;
    }
    public void withdraw(double withdraw) {
        balance -= withdraw;
    }
    public void printBalance() {
        System.out.println("Bank account : " + accountNumber + "." + " Balance : $" + balance);
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("234", 5000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        bankAccount.printBalance();
    }
}
