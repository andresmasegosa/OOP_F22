package session1;

/**
 * a) What is doing the method "void function(int n)"? (Hint: Use the debugger)
 * b) Re-write it using two nested for-loops?
 */
public class H_Exercise {

    public static void function(int n){
        for (int i = 0; i < n; i++) {
            int result = 1;
            int e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) {

        H_Exercise.function(10);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session1_H", I_did_finish, I_did_understand, comment);
        */

    }
}
