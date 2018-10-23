package lv.javaguru.lessons.l5.p1;

/**
 * @author Konstantins Buts on 23/10/2018.
 */
public class Vaper {

    public static void main(String[] args) {

        Vape vape = new Vape();

        System.out.println("Just bought");
        System.out.println(vape);

        vape.refill();

        System.out.println("Just refilled");
        System.out.println(vape);

        System.out.println("Trying to vape");
        vape.vape();

        vape.turnOn();

        System.out.println("Turned on");
        System.out.println(vape);

        vape.vape();
        System.out.println(vape);

        vape.setPower(500);
        System.out.println("Changed power to 500");
        System.out.println(vape);

        vape.setPower(200);
        System.out.println("Changed power to 200");
        System.out.println(vape);

        vape.vape();
        vape.vape();
        vape.vape();
        vape.vape();
        vape.vape();

        System.out.println("Did it 5 times");
        System.out.println(vape);

        vape.vape();
        System.out.println(vape);

        System.out.println("Refilling it again");
        vape.refill();
        System.out.println(vape);

        System.out.println("Turning it off");
        vape.turnOff();
        System.out.println(vape);

        System.out.println();
        System.out.println();
        System.out.println();

        Vape firstVape = new Vape();
        Vape secondVape = new Vape();

        System.out.println("Both are equal: " + firstVape.equals(secondVape));

        secondVape.turnOn();

        System.out.println("Turned on second vape...");
        System.out.println("Both are equal: " + firstVape.equals(secondVape));

    }

}
