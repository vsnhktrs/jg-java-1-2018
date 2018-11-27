package lv.javaguru.lessons.l10.p1;

/**
 * @author Konstantins Buts on 2018-11-27.
 */
public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("The name is null");
        }

        if (age < 0 || age > 150) {
            throw new IllegalAgeArgumentException("The age must be within 0 to 150");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
