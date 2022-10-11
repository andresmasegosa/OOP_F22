package session6.b_list;

import java.util.Comparator;

public class LengthOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()>o2.length() ? 1 : -1;
    }
}
