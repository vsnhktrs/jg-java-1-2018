package lv.javaguru.lessons.l8.p2;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class MinLengthValidator extends AbstractStringValidator {

    @Override
    public boolean validate(String arg) {
        if (checkIfNotNull(arg)) {
            System.out.println("Validating " + arg + " for min length..");
            return !arg.isEmpty(); //returns true if length is not 0
        }
        return false;
    }

}
