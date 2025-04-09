package BTVN.Buoi6;

public class SavingsAccount extends BankAccount implements Transaction {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    private static final double MIN_BALANCE = 500;

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient balance! Minimum balance required: " + MIN_BALANCE);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    public void deposit(double amount, String currency) {
        System.out.println("Depositing " + amount + " " + currency);
    }



}
