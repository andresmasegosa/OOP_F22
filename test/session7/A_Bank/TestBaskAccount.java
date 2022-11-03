package session7.A_Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestBaskAccount {

    @Test
    public void isOverdrawn01() {
        BankAccount account = new BankAccount(100);
        account.withdraw(500_000);
        assertTrue(account.isOverdrawn());
    }

    @Test
    public void isOverdrawn02() {
        BankAccount account = new BankAccount(100);
        account.withdraw(25);
        assertFalse(account.isOverdrawn());
    }

    @Test
    public void openAccount() {
        BankAccount account = new BankAccount(100);
        assertNotNull(account);
    }

}
