package pt.ual.bank;

public class AccountClass implements Account {
    private String number;
    private String holder;
    private double balance;

    public AccountClass(String number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount, double operationCost) throws InvalidAmountException {
        if(amount > balance) {
            throw new InvalidAmountException();
        }
        balance -= (amount + operationCost);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
