package lv.javaguru.lessons.l4.p1;

/**
 * @author Konstantins Buts on 16/10/2018.
 */
public class HumanAgeClassifier {

    String classify(int age) {
        if (age < 0) {
            return "inexist@nt";
        } else if ((age >= 0) && (age <= 2)) {
            return "baby";
        } else if ((age >= 3) && (age <= 6)) {
            return "child";
        } else if ((age >= 7) && (age <= 12)) {
            return "youngster";
        } else if ((age >= 13) && (age <= 18)) {
            return "teenager";
        } else if ((age >= 19) && (age <= 24)) {
            return "student";
        } else if ((age >= 25) && (age <= 65)) {
            return "hard-working-depressed-adult";
        } else if ((age >= 66) && (age <= 100)) {
            return "senior";
        } else {
            return "dead";
        }
    }

    int classify(String humanType) {
        int classifiedAge = -1;

        switch (humanType) {
            case "baby":
                classifiedAge = 0;
                break;
            case "child":
                classifiedAge = 3;
                break;
            case "youngster":
                classifiedAge = 7;
                break;
            case "teenager":
                classifiedAge = 13;
                break;
            default:
                classifiedAge = 1337;
        }

        return classifiedAge;
    }

}
