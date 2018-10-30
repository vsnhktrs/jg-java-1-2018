package lv.javaguru.lessons.l6.p1;

/**
 * @author Konstantins Buts on 30/10/2018.
 */
public class LeapYearFinder {

    public static void main(String[] args) {

        int startYear = 2018;
        int endYear = 2118;

        for (int currentYear = startYear; currentYear <= endYear; currentYear++) {
            if (currentYear % 4 == 0) {
                System.out.print(currentYear + ", ");
            }
        }

    }

}
