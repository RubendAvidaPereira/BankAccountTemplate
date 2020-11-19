package pt.ual.bank;

public class InvalidAmountException extends Exception {
	
	private static final long serialVersionUID = 501;
	
	public InvalidAmountException() {
		super();
		System.out.println("InvalidAmountException");
	}
}
