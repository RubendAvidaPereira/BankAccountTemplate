package pt.ual.bank;

public class SavingsAccount extends AccountClass implements InterestRateInstrument {

	private double rate;
    
	public SavingsAccount(String number, String holder, double balance) {
		super(number, holder, balance);
		this.rate = 0;
	}
	
	public void setRate(double rate) throws NegativeRateException { 
		if (rate < 0 ) {
			throw new NegativeRateException();
		}
		this.rate = this.rate + rate;
	}
	
	public double getRate() { 
		return this.rate;
	}
	
	public void updateBalance() { 
		this.balance = this.balance - (this.balance * (this.rate/100));
	}
}
