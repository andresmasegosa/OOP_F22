package session9.a_bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exercise: Change the deposit method of the BankAccount class
 * to avoid that  a negative quantity can be deposited by throwing
 * an exception.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(100);

        System.out.println("Current Account Balance: "+account.getBalance());

        System.out.println("Enter an amount to deposit:");

        try{
            int amount = scanner.nextInt();
            account.deposit(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input a number. You did  input: " + scanner.nextLine());
        }



        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session9_A", I_did_finish, I_did_understand, comment);
        */
    }
}
