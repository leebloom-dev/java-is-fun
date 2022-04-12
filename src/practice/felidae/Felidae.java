package practice.felidae;

import java.util.Scanner;

public class Felidae {

    /* FIELDS */
    private String hasStripes;
    private String hasSpots;
    private String hasClaws;
    private String sound;
    private String species;

    /* CONSTRUCTORS */
    public Felidae() {
    }

    /* METHODS: GETTERS AND SETTERS */
    public String isHasStripes() {
        return hasStripes;
    }

    public void setHasStripes(String hasStripes) {
        this.hasStripes = hasStripes;
    }

    public String isHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(String hasSpots) {
        this.hasSpots = hasSpots;
    }

    public String isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(String hasClaws) {
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
    public void getData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Species: ");
        setSpecies(input.nextLine());
        System.out.print("Sound: ");
        setSound(input.nextLine());
        System.out.print("Has claws(true/false): ");
        setHasClaws(input.nextLine());
        System.out.print("Has Spots(true/false): ");
        setHasSpots(input.nextLine());
        System.out.print("Has Stripes(true/false): ");
        setHasStripes(input.nextLine());
    }

    public void display() {

        System.out.println(
            "\nThe " + getSpecies() + " makes a " + "\"" +
                getSound() + "\"" + " sound."
        );
        System.out.println(getSpecies() + "'s has claws: " + isHasClaws());
        System.out.println(getSpecies() + "'s has stripe: " + isHasStripes());
        System.out.println(getSpecies() + "'s has spots: " + isHasSpots() + "\n");
    }
}
