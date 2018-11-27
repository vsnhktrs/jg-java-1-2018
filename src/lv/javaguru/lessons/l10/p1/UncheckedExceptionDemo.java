package lv.javaguru.lessons.l10.p1;

/**
 * @author Konstantins Buts on 2018-11-27.
 */
public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        User user = new User("Name", 30);

        User user1 = new User(null, 50);
        System.out.println();

        User user2 = new User("Name", 160); //won't be called
        System.out.println();

        System.out.println("Always run");

    }

}
