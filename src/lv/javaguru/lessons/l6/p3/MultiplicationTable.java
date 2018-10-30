package lv.javaguru.lessons.l6.p3;

/**
 * @author Konstantins Buts on 30/10/2018.
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }

    }

}
