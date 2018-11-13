package lv.javaguru.lessons.l8.p1;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class MallardDuck implements Eatable, Flyable, Quackable {

    private Eatable eatBehaviour;
    private Flyable flyBehaviour;
    private Quackable quackBehaviour;

    @Override
    public void eat() {
        if (eatBehaviour != null) {
            eatBehaviour.eat();
        }
    }

    @Override
    public void fly() {
        if (flyBehaviour != null) {
            flyBehaviour.fly();
        }
    }

    @Override
    public void quack() {
        if (quackBehaviour != null) {
            quackBehaviour.quack();
        }
    }

    public void setEatBehaviour(Eatable eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
    }

    public void setFlyBehaviour(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(Quackable quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

}
