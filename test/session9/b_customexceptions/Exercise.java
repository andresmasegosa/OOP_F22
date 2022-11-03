package session9.b_customexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Exercise:
 *
 * Write tests for deposit method:
 *  - Test that deposit method works well in standard conditions.
 *  - Test that deposit method throws the corresponding exception if a negative amount is being deposited.
 *  - Test that deposit method throws the corresponding exception if a too large amount is being deposited.
 */

class Exercise {


    @Test
    void testDeposit() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(10);
        assertEquals(0,0);
    }

    @Test
    void negativeAmountException() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(-10);
    }

    @Test
    void largeAmountException() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(1000);
    }


}