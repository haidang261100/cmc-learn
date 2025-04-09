package BTVN.Buoi6;

public class Banking {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("A", 1000);
        CurrentAccount current = new CurrentAccount("B", 500);

        savings.displayBalance();
        savings.deposit(200);
        savings.withdraw(800);
        savings.deposit(100, "USD");

        current.displayBalance();
        current.deposit(300);
        current.withdraw(1000);
        current.deposit(500, "EUR");
}
}
