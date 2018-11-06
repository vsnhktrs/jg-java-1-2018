package lv.javaguru.lessons.l7.p2;

import java.util.Arrays;

/**
 * @author Konstantins Buts on 06/11/2018.
 */
public class LinearSortDemo {

    public static void main(String[] args) {

        int[] numbers = {3, 2, 7, 9, 8, 5, 1, 4, 6};

        System.out.println("Numbers (before sort) = " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {

            int min = numbers[i];

            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];

                    int temp = numbers[i];
                    numbers[i] = min;
                    numbers[j] = temp;
                }
            }

        }

        System.out.println("Numbers (after sort) = " + Arrays.toString(numbers));

    }

}
