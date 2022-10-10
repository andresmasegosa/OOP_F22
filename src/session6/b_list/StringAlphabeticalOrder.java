package session6.b_list;

import java.util.Comparator;

public class StringAlphabeticalOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
