package lv.javaguru.lessons.l9.p2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Konstantins Buts on 20/11/2018.
 */
public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, String> characteristics = new HashMap<>();
        characteristics.put("John Doe", "Good");
        characteristics.put("Jane Doe", "Good");
        characteristics.put("Jackie Chan", "The Best");
        characteristics.put("Karlis Ulmanis", "Bestest");
        characteristics.put("Leonardo Dicaprio", "Meh");

        System.out.println(characteristics);

        System.out.println("Jane Doe is " + characteristics.get("Jane Doe"));

        System.out.println("Good people are ");
        for (Map.Entry<String, String> characteristic : characteristics.entrySet()) {
            if ("Good".equals(characteristic.getValue())) {
                System.out.println(characteristic.getKey());
            }
        }

        System.out.println("Vladimir exists " + characteristics.containsKey("Vladimir"));
        System.out.println("Removing Jackie Chan = " + characteristics.remove("Jackie Chan"));

    }

}
