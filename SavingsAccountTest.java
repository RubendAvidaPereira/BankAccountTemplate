package pt.ual.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {
	
	@Test 
	void setRate() throws NegativeRateException {
		SavingsAccount account = new SavingsAccount("123123123", "John", 1000.0);
		account.setRate(6.0);
		assertEquals(6.0, account.getRate());
	}
	
	@Test 
	void rateOverTheLimit() {
		SavingsAccount account = new SavingsAccount("123123123", "John", 1000.0);
		assertThrows(NegativeRateException.class, () -> account.setRate(-1.0));
	}
	
	@Test 
	void getRate() throws NegativeRateException { 
		SavingsAccount account = new SavingsAccount("123123123", "John", 1000.0);
		account.setRate(6.0);
		assertEquals(6.0, account.getRate());
	}
	
	@Test 
	void updateBalance() throws NegativeRateException { 
		SavingsAccount account = new SavingsAccount("123123123", "John", 1000.0);
		account.setRate(6.0);
		account.updateBalance();
		assertEquals(940.0, account.getBalance());
	}
}
