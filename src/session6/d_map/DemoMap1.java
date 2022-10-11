package session6.d_map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap1 {
    public static void main(String[] args) {
        Map<String, Integer> birthYear = new HashMap<>();

        birthYear.put("George Washington", 1732);
        birthYear.put("Abraham Lincoln", 1809);
        birthYear.put("Barack Obama", 1961);
        birthYear.put("Donald Trump", 1946);

        Integer obamaYear = birthYear.get("Barack Obama");

        System.out.println("Mr. Obama was born in: " + obamaYear);
        System.out.println();

        System.out.println("We have information on the presidents:");
        for (String president : birthYear.keySet()) {
            System.out.println("Mr. " + president);
        }

        //Print the birth years of all the presidents.
        for (Integer year : birthYear.values()) {
            System.out.println(year);
        }


    }
}
