package pt.ual.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusineesAccountClassTest {
	
	@Test
	public void getLoanLimit() {
		BusinessAccount account = new BusinessAccountClass("123123123", "John", 1000.0);
		account.setLoanLimit(1000.0);
		assertEquals(1000.0, account.getLoanLimit());
	}
	
	@Test
	public void setLoanLimit() {
		BusinessAccount account = new BusinessAccountClass("123123123", "John", 1000.0);
		account.setLoanLimit(1000.0);
		assertEquals(1000.0, account.getLoanLimit());
	}
	
	@Test 
	public void loan() throws InvalidAmountException {
		BusinessAccount account = new BusinessAccountClass("123123123", "John", 1000.0);
		account.setLoanLimit(1000.0);
		account.loan(500.0, -1.23);
		assertEquals(1498,77, account.getBalance());
	}

}
