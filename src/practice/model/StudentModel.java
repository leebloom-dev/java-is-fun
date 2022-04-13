package practice.model;

/*
* This model performs the logistics need to both set and get
* student information. Doesn't even know the View exists.
* */

public class StudentModel {

    /* FIELDS */
    // Holds student information
    private String name;
    private String roll;

    /* METHODS: GETTERS AND SETTERS */
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String aRoll) {
        this.roll = aRoll;
    }

}
