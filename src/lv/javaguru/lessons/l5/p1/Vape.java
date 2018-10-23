package lv.javaguru.lessons.l5.p1;

import java.util.Objects;

/**
 * @author Konstantins Buts on 23/10/2018.
 */
public class Vape {

    private int liquid;
    private int power;
    private boolean isOn;

    public Vape() {
        liquid = 0;
        power = 20;
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setPower(int power) {
        if (canSetSpecifiedPower(power)) {
            this.power = power;
        }
    }

    public int getPower() {
        return power;
    }

    public void refill() {
        liquid = 1000;
    }

    public void vape() {
        if (!isOn) {
            System.out.println("It is off. Turn it on first.");
        } else {
            if (liquid <= 0) {
                System.out.println("Should've refilled it before.. Feel bad now. Damn.s");
            } else {
                System.out.println("It feels so good.. Damn..");
                liquid = liquid - power;
            }
        }
    }

    private boolean canSetSpecifiedPower(int power) {
        if (power > 0 && power <= 220) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vape vape = (Vape) o;
        return liquid == vape.liquid &&
                power == vape.power &&
                isOn == vape.isOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liquid, power, isOn);
    }

    @Override
    public String toString() {
        return "Vape isOn = \'" + isOn
                + "\', current power is set to \'"
                + power + "\' and has \'"
                + liquid + "\' ml of liquid left";
    }

}
