package BTVN.Buoi6;

public abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println( "balance: " + balance);
    }
}
