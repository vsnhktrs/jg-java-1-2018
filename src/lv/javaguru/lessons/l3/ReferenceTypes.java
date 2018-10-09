package lv.javaguru.lessons.l3;

/**
 * @author Konstantins Buts on 09/10/2018.
 */
public class ReferenceTypes {

    //Integer references
    Byte iByte;
    Short iShort;
    Integer iInt;
    Long iLong;

    //Float references
    Float iFloat;
    Double iDouble;

    //Symbolic references
    Character iChar;

    //Logical references
    Boolean iBoolean;

    void printDefaultVariableValues() {
        System.out.println("Integers:");
        System.out.println("Byte = " + iByte);
        System.out.println("Short = " + iShort);
        System.out.println("Integer = " + iInt);
        System.out.println("Long = " + iLong);

        System.out.println("Floats:");
        System.out.println("Float = " + iFloat);
        System.out.println("Double = " + iDouble);

        System.out.println("Symbolic:");
        System.out.println("Character = " + iChar);

        System.out.println("Logical:");
        System.out.println("Boolean = " + iBoolean);
    }

}
