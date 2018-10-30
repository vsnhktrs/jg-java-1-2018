package lv.javaguru.lessons.l6.p2;

/**
 * @author Konstantins Buts on 30/10/2018.
 */
public class BusSchedule {

    public static void main(String[] args) {

        for (int dayOfTheWeek = 1; dayOfTheWeek <= 7; dayOfTheWeek++) {

            if (dayOfTheWeek >= 1 && dayOfTheWeek <= 5) {
                System.out.println(dayOfTheWeek + ": 15 min");
            } else {
                System.out.println(dayOfTheWeek + ": 30 min");
            }

        }

    }

}
