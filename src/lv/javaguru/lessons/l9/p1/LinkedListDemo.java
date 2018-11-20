package lv.javaguru.lessons.l9.p1;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Konstantins Buts on 20/11/2018.
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> animals = new LinkedList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Fox");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Donkey");

        System.out.println(animals);

    }

}
