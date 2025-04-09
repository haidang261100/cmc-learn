package BTVN.Buoi6;

public class CurrentAccount extends BankAccount implements Transaction {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    private static final double OVERDRAFT_LIMIT = 1000;
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded! Maximum overdraft allowed: " + OVERDRAFT_LIMIT);
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

