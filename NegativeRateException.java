package pt.ual.bank;

public class NegativeRateException extends Exception {

	private static final long serialVersionUID = 500;
	
	public NegativeRateException() {
		super();
		System.out.println("NegativeRateException");
	}
}
