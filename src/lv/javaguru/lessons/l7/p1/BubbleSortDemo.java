package lv.javaguru.lessons.l7.p1;

import java.util.Arrays;

/**
 * @author Konstantins Buts on 06/11/2018.
 */
public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] numbers = {3, 2, 7, 55, 9, 8, 5, 55, 1, 4, 6, -1};

        System.out.println("Numbers (before sort) = " + Arrays.toString(numbers));

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("Numbers (after sort) = " + Arrays.toString(numbers));

    }

}
