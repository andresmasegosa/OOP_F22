package session9.b_customexceptions;

import java.util.Scanner;

/**
 *  Exercise:
 *
 *  - Introduce changes in the "deposit" method of the
 *    class BankAccount to avoid that a negative
 *    quantity can be deposited using a custom
 *    exception "NegativeDepositException".
 *
 *  - Introduce a custom exception "WarningLargeDeposit"
 *    to give a warning to the user when s/he is depositing
 *    more than 100_000 DKK, stating that s/he must justify
 *    the origin of the money to SKAT.
 *
 *  - Catch both exceptions and print out custom waning messages.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(100);

        System.out.println("Current Account Balance: "+account.getBalance());

        System.out.println("Enter an amount to deposit:");
        int amount = scanner.nextInt();

        try {
            account.deposit(amount);
        }catch (NegativeDepositException e){
            System.out.println("Man, you were trying to deposit a negative ammount");
        }catch (WarningLargeDeposit e){
            System.out.println("You must justify the origin of the" + e.getAmount()+" your " +
                    "are trying to deposit here. Remeber the limit in your country" +
                    "is "+e.getDepositLimit());
        }

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session9_B", I_did_finish, I_did_understand, comment);
        */
    }
}
