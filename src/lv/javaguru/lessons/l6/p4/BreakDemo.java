package lv.javaguru.lessons.l6.p4;

/**
 * @author Konstantins Buts on 30/10/2018.
 */
public class BreakDemo {

    public static void main(String[] args) {

        int counter = 0;
        while (true) {
            System.out.println("Counter = " + counter);

            if (counter == 500) {
                break;
            }

            counter++;
        }

    }

}
