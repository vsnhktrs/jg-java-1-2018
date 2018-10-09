package lv.javaguru.lessons.l3;

/**
 * @author Konstantins Buts on 09/10/2018.
 */
public class PrimitiveTypes {

    //Integer primitives
    byte iByte;
    short iShort;
    int iInt;
    long iLong;

    //Float primitives
    float iFloat;
    double iDouble;

    //Symbolic primitives
    char iChar;

    //Logical primitives
    boolean iBoolean;

    void printDefaultVariableValues() {
        System.out.println("Integers:");
        System.out.println("byte = " + iByte);
        System.out.println("short = " + iShort);
        System.out.println("int = " + iInt);
        System.out.println("long = " + iLong);

        System.out.println("Floats:");
        System.out.println("float = " + iFloat);
        System.out.println("double = " + iDouble);

        System.out.println("Symbolic:");
        System.out.println("char = " + iChar);

        System.out.println("Logical:");
        System.out.println("boolean = " + iBoolean);
    }

}
