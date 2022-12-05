package session13.visitors;

import session13.mathexpression.Node;
import session13.mathexpression.MathExpression;

import java.util.Scanner;

/**
 * Update the current code to also consider the substraction operation encoded with the symbol "-".
 * Hints:
 *  - Create a class: "SubtractionNode".
 *  - Update MathExpression's parse method.
 *  - Update the CountOperations class.
 */

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Enter the math expression (e.g., 3 + 2 = )");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println();

        //We create the object
        MathExpression mathExpression = new MathExpression();
        mathExpression.parse(line);

        System.out.println("Printing the parsed expression:");
        System.out.println(mathExpression);
        System.out.println();
        System.out.println();


        System.out.println("Counting the number of operations: ");
        Visitor countOperations = new CountOperations();

        for (Node node : mathExpression) {
            node.accept(countOperations);
        }
        System.out.println(countOperations);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session13_A", I_did_finish, I_did_understand, comment);
        */

    }
}
