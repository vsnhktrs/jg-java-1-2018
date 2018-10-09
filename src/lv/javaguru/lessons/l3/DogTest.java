package lv.javaguru.lessons.l3;

/**
 * @author Konstantins Buts on 09/10/2018.
 */
public class DogTest {

    public static void main(String[] args) {

        Dog myDog = new Dog("Vasek");

        System.out.println("My dog name is " + myDog.getName());

        myDog.setName("B0b1k");

        System.out.println("My dog new name is " + myDog.getName());

        myDog.voice();

    }

}
