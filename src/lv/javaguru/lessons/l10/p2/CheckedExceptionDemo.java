package lv.javaguru.lessons.l10.p2;

/**
 * @author Konstantins Buts on 2018-11-27.
 */
public class CheckedExceptionDemo {

    public static void main(String[] args) {

        Divider divider = new Divider();

        System.out.println("Before tries");

        try {
            double result = divider.divide(15, 5);
        } catch (DivideByZeroException e) {
            System.out.println("Error occured: " + e.getMessage());
        }

        try {
            double result2 = divider.divide(15, 0);
        } catch (DivideByZeroException e) {
            System.out.println("Error occured: " + e.getMessage());
        }

        try {
            double result3 = divider.divide(10, 0);
        } catch (DivideByZeroException e) {
            System.out.println("Error occured: " + e.getMessage());
        }

        System.out.println("After tries");

    }

}
