package session6.b_list;

import java.util.*;

/**
 * Exercise: Create a new comparator that allows ordering the String objects of a List
 * by their length (i.e. their number of characters, shortest strings come first).
 */
public class ExerciseSortList {

    public static void main(String[] args) {
        List<String> cards = new LinkedList<>();

        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");
        cards.add("Ace of Hearts");
        cards.add(1,"Two of Clubs");

        Comparator<String> comparator = new LengthOrder();
        Collections.sort(cards, comparator);

        for (String card: cards){
            System.out.println(card);
        }

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session6_B", I_did_finish, I_did_understand, comment);
        */
    }

}
