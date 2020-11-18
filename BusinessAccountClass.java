package pt.ual.bank;

public class BusinessAccountClass implements BusinessAccount {
	
	private String number;
    private String holder;
    private double balance;
	private double loanLimit;
	
	public BusinessAccountClass(String number, String holder, double balance) {
		 this.number = number;
	     this.holder = holder;
	     this.balance = balance;
	}
	
	public double getLoanLimit() {
		return this.loanLimit;
	}
	
	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount, double operationCost) throws InvalidAmountException {
		if (amount > this.loanLimit) {
			 throw new InvalidAmountException();
		}
		this.balance = this.balance + (amount + operationCost);
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
