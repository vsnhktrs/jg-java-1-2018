package lv.javaguru.lessons.l8.p1;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class HomeDuck implements Flyable, Quackable, Eatable {

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }

    @Override
    public void quack() {
        System.out.println("Quack..");
    }

    @Override
    public void fly() {
        System.out.println("I fly");
    }

}
