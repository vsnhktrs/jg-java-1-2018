package lv.javaguru.lessons.l7.p3;

/**
 * @author Konstantins Buts on 06/11/2018.
 */
public class LookupArrayService {

    public int findMax(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

}
