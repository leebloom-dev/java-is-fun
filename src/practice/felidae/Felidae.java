package practice.felidae;

public class Felidae {

    /* FIELDS */
    private boolean hasStripes = false;
    private boolean hasSpots = false;
    private boolean hasClaws = false;
    private String sound;
    private String species;

    /* CONSTRUCTORS */
    public Felidae() {
    }

    /* METHODS: GETTERS AND SETTERS */
    public boolean isHasStripes() {
        return hasStripes;
    }

    public void setHasStripes(boolean hasStripes) {
        this.hasStripes = hasStripes;
    }

    public boolean isHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(boolean hasSpots) {
        this.hasSpots = hasSpots;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    /* METHODS */
    public void display() {
        System.out.println("Display information");
    }
}
