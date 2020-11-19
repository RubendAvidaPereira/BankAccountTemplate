package pt.ual.bank;

public interface InterestRateInstrument {

	void setRate(double rate) throws NegativeRateException;
	
	double getRate();
	
	void updateBalance();
}
