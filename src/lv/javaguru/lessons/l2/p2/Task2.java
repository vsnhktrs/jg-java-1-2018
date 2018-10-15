package lv.javaguru.lessons.l2.p2;

/**
 * @author Konstantins Buts on 02/10/2018.
 */
public class Task2 {

    public static void main(String[] args) {

        //Here we add numbers
        long longNumber = 2;
        int intNumber = 3;

        long longResult = longNumber + intNumber;

        System.out.println("Addition result = " + longResult);

        //Here we subtract numbers
        int firstSubtractNumber = 10;
        float secondSubtractNumber = 3.14f;

        float subtractionResult = firstSubtractNumber - secondSubtractNumber;

        System.out.println("Subtraction result = " + subtractionResult);

        //Here we multiply numbers
        short firstMultiplier = 1000;
        short secondMultiplier = 2000;

        short multiplicationResult = (short) (firstMultiplier * secondMultiplier);

        System.out.println("Multiplication result = " + multiplicationResult);

        //Here we divide.. things
        int firstValue = 20;
        int secondValue = 5;
        int divisionResult = firstValue / secondValue;

        System.out.println("Division result = " + divisionResult);

    }

}
