package lv.javaguru.lessons.l8.p2;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class MaxLengthValidator extends AbstractStringValidator {

    @Override
    public boolean validate(String arg) {
        if (checkIfNotNull(arg)) {
            System.out.println("Validating " + arg + " for max length..");
            return arg.length() < 10;
        }
        return false;
    }

}
