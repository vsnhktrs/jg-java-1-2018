package lv.javaguru.lessons.l8.p2;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public abstract class AbstractStringValidator implements Validator {

    protected boolean checkIfNotNull(String arg) {
        return arg != null;
    }

}
