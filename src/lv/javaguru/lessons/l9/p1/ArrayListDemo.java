package lv.javaguru.lessons.l9.p1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Konstantins Buts on 20/11/2018.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Grapefruit");
        fruits.add("Banana");

        System.out.println(fruits);

        fruits.remove("Orange");

        System.out.println(fruits);

        fruits.remove(1);

        System.out.println(fruits);
        System.out.println("List size = " + fruits.size());

        System.out.println("Index of Banana = " + fruits.indexOf("Banana"));
        System.out.println("Index of Mango = " + fruits.indexOf("Mango"));

        fruits.add("Apple");

        System.out.println(fruits);

        System.out.println("Index of Apple = " + fruits.indexOf("Apple"));
        System.out.println("LastIndex of Apple = " + fruits.lastIndexOf("Apple"));

        fruits.add(2, "Apple");

        System.out.println(fruits);
        System.out.println("Index of Apple = " + fruits.indexOf("Apple"));
        System.out.println("LastIndex of Apple = " + fruits.lastIndexOf("Apple"));

        int applesCount = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("Apple")) {
                applesCount++;
            }
        }
        System.out.println("Apples count = " + applesCount);

        System.out.println("Contains Grapefruit = " + fruits.contains("Grapefruit"));

        fruits.sort(new FruitsComparator());

        System.out.println(fruits);

        fruits.clear();

        System.out.println(fruits);

    }

}
