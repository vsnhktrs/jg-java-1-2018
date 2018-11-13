package lv.javaguru.lessons.l8.p1;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class ForcedFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm flying when kicked");
    }

}
