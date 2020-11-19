package pt.ual.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusineesAccountClassTest {
	
	@Test
	void getLoanLimit() {
		BusinessAccount account = new BusinessAccountClass("123123123", "John", 1000.0);
		account.setLoanLimit(1000.0);
		assertEquals(1000.0, account.getLoanLimit());
	}
	
	@Test
	void setLoanLimit() {
		BusinessAccount account = new BusinessAccountClass("123123123", "John", 1000.0);
		account.setLoanLimit(1000.0);
		assertEquals(1000.0, account.getLoanLimit());
	}
	
	@Test 
	void loan() throws InvalidAmountException {
		BusinessAccount account = new BusinessAccountClass("123123123", "John", 1000.0);
		account.setLoanLimit(1000.0);
		account.loan(500.0, -1.23);
		assertEquals(1498,77, account.getBalance());
	}
	
	@Test 
	void loanOverTheLimit() {
		BusinessAccount account = new BusinessAccountClass("123123123", "John", 1000.0);
		account.setLoanLimit(1000.0);
		assertThrows(InvalidAmountException.class, () -> account.loan(2000.0, -1.23));
	}

}
