package pt.ual.bank;

public interface Account {
    String getNumber();

    String getHolder();

    double getBalance();

    void withdraw(double amount, double operationCost) throws InvalidAmountException;

    void deposit(double amount);
}
