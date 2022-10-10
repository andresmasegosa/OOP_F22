package session6.d_map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap2 {
    public static void main(String[] args) {
        Map<PresidentName, Integer> birthYear = new HashMap<>();

        birthYear.put(new PresidentName("George Washington"), 1732);
        birthYear.put(new PresidentName("Abraham Lincoln"), 1809);
        birthYear.put(new PresidentName("Barack Obama"), 1961);

        Integer obamaYear = birthYear.get(new PresidentName("Barack Obama"));

        System.out.println("Mr. Obama was born in: " + obamaYear);
        System.out.println();


    }
}
