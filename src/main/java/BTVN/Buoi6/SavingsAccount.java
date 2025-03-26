package BTVN.Buoi6;

public class SavingsAccount extends BankAccount implements Transaction {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
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
