package practice;

import practice.felidae.pantherinae.panthera.Tiger;

public class Main {

    public static void main(String[] args) {

        /* USING @Override */

        /*
        * @Override annotation informs the compiler that the element is
        * meant to override an element declared in a superclass.
        * */

        Tiger tiger = new Tiger();
        tiger.setHasStripes(true);
        tiger.display();

    }
    
}