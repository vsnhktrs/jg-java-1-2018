package lv.javaguru.lessons.l4.p1;

/**
 * @author Konstantins Buts on 16/10/2018.
 */
public class HumanAgeClassifierTest {

    public static void main(String[] args) {

        HumanAgeClassifierTest testRunner = new HumanAgeClassifierTest();
        testRunner.test1();
        testRunner.test2();

    }

    void test1() {

        HumanAgeClassifier classifier = new HumanAgeClassifier();

        int expectedResult = 0;
        int actualResult = classifier.classify("baby");

        check(actualResult, expectedResult, "test1");

    }

    void test2() {

        HumanAgeClassifier classifier = new HumanAgeClassifier();

        String expectedResult = "student";
        String actualResult = classifier.classify(20);

        check(actualResult, expectedResult, "test2");

    }

    void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + ", but was " + actualResult);
        }
    }

    void check(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + ", but was " + actualResult);
        }
    }

}
