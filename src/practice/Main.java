package practice;

import practice.transportation.Bicycle;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();

        // Display bicycle default info
        bicycle.display();

        // Add some operations
        bicycle.speedUp(19);
        bicycle.changeGear(2);
        bicycle.display();

        bicycle.applyBrakes(5);
        bicycle.display();

    }
    
}