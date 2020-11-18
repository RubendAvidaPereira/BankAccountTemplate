package pt.ual.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountClassTest {

    @Test
    void getNumber() {
        Account account = new AccountClass("123123123", "John", 1000.0);
        assertEquals("123123123", account.getNumber());
    }

    @Test
    void getHolder() {
        Account account = new AccountClass("123123123", "John", 1000.0);
        assertEquals("John", account.getHolder());
    }

    @Test
    void getBalance() {
        Account account = new AccountClass("123123123", "John", 1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void withdraw() throws InvalidAmountException {
        Account account = new AccountClass("123123123", "John", 1000.0);
        account.withdraw(250.0, 5);
        assertEquals(745.0, account.getBalance());
    }

    @Test
    void withdrawOverTheLimit() {
        Account account = new AccountClass("123123123", "John", 1000.0);
        assertThrows(InvalidAmountException.class, () -> account.withdraw(2000.0, 5));
    }

    @Test
    void deposit() {
        Account account = new AccountClass("123123123", "John", 1000.0);
        account.deposit(250);
        assertEquals(1250, account.getBalance());
    }
}