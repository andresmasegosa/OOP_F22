package session13.visitors;

import session13.mathexpression.Node;
import session13.mathexpression.MathExpression;

import java.util.Scanner;

public class DemoCountOperations {
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
    }
}
