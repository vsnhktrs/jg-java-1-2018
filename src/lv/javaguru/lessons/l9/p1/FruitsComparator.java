package lv.javaguru.lessons.l9.p1;

import java.util.Comparator;

/**
 * @author Konstantins Buts on 20/11/2018.
 */
public class FruitsComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}
