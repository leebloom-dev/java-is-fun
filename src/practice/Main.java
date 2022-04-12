package practice;

import practice.felidae.pantherinae.panthera.SnowLeopard;
import practice.felidae.pantherinae.panthera.Tiger;

public class Main {

    public static void main(String[] args) {

        /* USING @Override */

        /*
        * @Override annotation informs the compiler that the element is
        * meant to override an element declared in a superclass.
        * */

        Tiger tiger = new Tiger();
        tiger.display();

        SnowLeopard snowLeopard = new SnowLeopard();
        snowLeopard.display();

        // TODO: Use @Override for Lion
        // TODO: Use @Override for Leopard
        // TODO: Use @Override for Jaguar
        // TODO: Use @Override for SundaCloudedLeopard
        // TODO: Use @Override for CloudedLeopard
        // TODO: Use @Override for Bobcat
        // TODO: Use @Override for DomesticCat
    }
    
}