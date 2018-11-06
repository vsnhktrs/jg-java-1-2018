package lv.javaguru.lessons.l7.p3;

/**
 * @author Konstantins Buts on 06/11/2018.
 */
public class LookupArrayServiceTest {

    public static void main(String[] args) {

        LookupArrayServiceTest testRunner = new LookupArrayServiceTest();
        testRunner.shouldReturn102WhenFindMax();

    }

    public void shouldReturn102WhenFindMax() {

        LookupArrayService service = new LookupArrayService();

        int[] numbers = {1, 3, 5, 102, 4, 29, 64, 7};

        int expectedResult = 102;
        int actualResult = service.findMax(numbers);

        check(actualResult, expectedResult, "Should find max in array: 102");

    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + ", but was " + actualResult);
        }
    }

}
