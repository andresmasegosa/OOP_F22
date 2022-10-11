package session1;

/**
 * a) Which is the function being computed by this code? (Hint: Use the debugger)
 * b) Re-write it using two nested for-loops?
 */
public class H_Exercise {
    public static void main(String[] args) {
        int e;
        int result;

        int n = 10;

        for (int i = 0; i < n; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }

            System.out.println(result);
        }

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        Feedback.submit("session1_H", I_did_finish, I_did_understand, comment);
        */

    }
}
