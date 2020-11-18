package pt.ual.bank;

public class InvalidAmountException extends Exception {
	
	private static final long serialVersionUID = 7718828512143293558L;
	
	public InvalidAmountException() {
		super();
		System.out.println("InvalidAmountException");
	}
}
