package quiz02;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234-123", 1000);
        acc.deposit(1000);
        acc.withdraw(500);
        double bal = acc.getBalance();
        System.out.println("잔액: " + bal);
    }
}
