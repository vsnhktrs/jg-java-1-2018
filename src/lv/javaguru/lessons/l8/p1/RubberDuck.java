package lv.javaguru.lessons.l8.p1;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class RubberDuck implements Quackable, Flyable {

    @Override
    public void quack() {
        System.out.println("Squeek..");
    }

    @Override
    public void fly() {
        System.out.println("Kick me and I will fly");
    }

}
