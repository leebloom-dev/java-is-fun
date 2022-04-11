package practice.felidae.pantherinae.panthera;

import practice.felidae.Felidae;

public class Tiger extends Felidae {

    /* CONSTRUCTORS */
    public Tiger() {
    }

    /* METHODS: GETTERS AND SETTERS */
    @Override
    public void setHasStripes(boolean hasStripes) {
        super.setHasStripes(hasStripes);
    }

    @Override
    public boolean isHasStripes() {
        return super.isHasStripes();
    }

    /* METHODS */
    @Override
    public void display() {
        System.out.println("Tiger has stripes? " + super.isHasStripes());
    }
}
