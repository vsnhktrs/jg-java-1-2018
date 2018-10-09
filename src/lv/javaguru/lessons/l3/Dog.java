package lv.javaguru.lessons.l3;

/**
 * @author Konstantins Buts on 09/10/2018.
 */
public class Dog {

    String name;

    Dog(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void voice() {
        System.out.println("Woof Woof. I am " + name);
    }

}
