package pt.ual.bank;

public interface BusinessAccount extends Account {

	String getNumber();
	
	String getHolder();
	
	double getLoanLimit();
	
	void setLoanLimit(double loanLimit);
	
	void loan(double amount, double operationCost) throws InvalidAmountException;
}
