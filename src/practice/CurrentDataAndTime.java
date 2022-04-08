package practice;

import java.util.Date;

public class CurrentDataAndTime {

    // Instantiate a Date Object
    private Date date = new Date();

    // Display time and date using toString()
    /*
     * String toString()
     * Convert invoking Date object to a string and returns
     * the result.
     * */

    public void display() {
        System.out.println(date.toString());
    }
}
