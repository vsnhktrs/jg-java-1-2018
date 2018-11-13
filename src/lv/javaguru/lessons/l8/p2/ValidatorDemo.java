package lv.javaguru.lessons.l8.p2;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class ValidatorDemo {

    public static void main(String[] args) {

        String input = "test str";

        Validator[] validators = {new MinLengthValidator(), new MaxLengthValidator()};

        for (Validator validator : validators) {
            boolean result = validator.validate(input);
            System.out.println("Validation result = " + result);
        }

    }

}
