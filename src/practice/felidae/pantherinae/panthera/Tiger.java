package practice.felidae.pantherinae.panthera;

import practice.felidae.Felidae;

public class Tiger extends Felidae {

    /* CONSTRUCTORS */
    public Tiger() {
    }

    /* METHODS */
    @Override
    public void display() {
        System.out.println("TIGERS");
        super.getData();
        super.display();
    }
}
