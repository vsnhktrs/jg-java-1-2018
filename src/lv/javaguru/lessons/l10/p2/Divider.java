package lv.javaguru.lessons.l10.p2;

/**
 * @author Konstantins Buts on 2018-11-27.
 */
public class Divider {

    public double divide(double a, double b) throws DivideByZeroException {
        if (b == 0d) {
            throw new DivideByZeroException("Tried to divide by zero");
        }
        return a / b;
    }

}
