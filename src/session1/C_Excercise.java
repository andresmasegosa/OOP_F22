package session1;

/**
 * Try to understand the rationale behind the outputs
 */
class C_Excercise {
    public static void main(String[] args) {
        int int_num = 10; //Dynamic initialization
        double double_num = 10.0;

        System.out.println("Original value of int_num: " + int_num);
        System.out.println("Original value of double_num: " + double_num);
        System.out.println();

        int_num = int_num / 4;
        double_num = double_num / 4;

        System.out.println("int_num after division: " + int_num);
        System.out.println("double_num after division: " + double_num);


        int_num = 10;
        double result = int_num/4;
        System.out.println("Result: " + result);

        double result2 = int_num/4.0;
        System.out.println("Result2: " + result2);


        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session1_C", I_did_finish, I_did_understand, comment);

    }

}