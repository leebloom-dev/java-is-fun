package practice.transportation;

import practice.interfaces.Vehicle;

public class Bicycle implements Vehicle {

    /* FIELDS */
    private int speed = 0; // default value
    private int gear = 1; // default value

    /* CONSTRUCTORS */
    public Bicycle() {
    }

    /* METHODS: Interface */
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    /* METHODS */
    public void display() {
        System.out.println("\nspeed: " + speed + "\ngear: " + gear + "\n");
    }
}
