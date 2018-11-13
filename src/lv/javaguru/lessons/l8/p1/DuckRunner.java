package lv.javaguru.lessons.l8.p1;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public class DuckRunner {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehaviour(new ForcedFly());
        mallardDuck.setEatBehaviour(new NormalEat());
        mallardDuck.setQuackBehaviour(new NormalQuack());

        mallardDuck.eat();
        mallardDuck.fly();
        mallardDuck.quack();

    }

}
