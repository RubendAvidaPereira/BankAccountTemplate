package pt.ual.bank;

public interface BusinessAccount extends Account {

	double getLoanLimit();
	
	void setLoanLimit(double loanLimit);
	
	void loan(double amount, double operationCost) throws InvalidAmountException;
}
