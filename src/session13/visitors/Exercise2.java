package session13.visitors;

import session13.mathexpression.Node;
import session13.mathexpression.MathExpression;

import java.util.Scanner;

/**
 * Create a new visitor class which is able to compute the result of an expression. E.g., if the input is "4 + 3 - 2 = "
 * the visitor will return "5".
 * Hints:
 *  - Create a class: "Evaluator", which contains:
 *      - A field "int result" where the accumulated result is stored.
 *      - A field "int currentInteger" tracking the last found integer when visiting the expression.
 *      - A field "Node lastOperation" tracking the last found operation when visiting the expression.
 *
 *  - Implements the methods in the "Evaluator" class which will update the field "result" as they visit each node.
 */

public class Exercise2 {

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


        System.out.println("Evaluating the expression: ");
        Visitor evaluator = null;

        for (Node node : mathExpression) {
            node.accept(evaluator);
        }
        System.out.println(evaluator);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session13_B", I_did_finish, I_did_understand, comment);
        */

    }
}
