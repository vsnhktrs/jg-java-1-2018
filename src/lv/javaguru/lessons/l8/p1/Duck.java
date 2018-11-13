package lv.javaguru.lessons.l8.p1;

/**
 * @author Konstantins Buts on 13/11/2018.
 */
public abstract class Duck {

    void eat() {
        System.out.println("I'm eating.. yummy");
    }

    abstract void quack();
    abstract void fly();

}
