package lv.javaguru.lessons.l9.p3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Konstantins Buts on 20/11/2018.
 */
public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Opel");
        cars.add("Kia");
        cars.add("Hyundai");
        cars.add("Mercedes");
        cars.add("Lada");

        Set<String> set = new HashSet<>();
        set.add("abc");
        set.remove("abc");

        System.out.println(cars);

        cars.add("BMW");

        System.out.println(cars);

    }

}
