package session6.b_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoSortList {

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>();

        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");
        cards.add("Ace of Hearts");
        cards.add("Two of Clubs");

        Comparator<String> comparator = new StringAlphabeticalOrder();
        Collections.sort(cards, comparator);

        for (String card: cards){
            System.out.println(card);
        }

    }

}
