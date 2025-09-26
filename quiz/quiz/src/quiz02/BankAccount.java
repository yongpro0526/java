package quiz02;

public class BankAccount {
    String AccountNumber;
    double Balance;

    BankAccount(String AccountNumber, double Balance) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    void deposit(double amount) {
        Balance += amount;
    }

    void withdraw(double amount) {
        Balance -= amount;
    }

    double getBalance() {
        return Balance;
    }
}
