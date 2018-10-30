package lv.javaguru.lessons.l6.p5;

/**
 * @author Konstantins Buts on 30/10/2018.
 */
public class ContinueDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            if (i > 20 && i < 50) {
                continue;
            }

            System.out.println("i = " + i);

        }

    }

}
