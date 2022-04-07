package practice.arrays;

import java.util.Scanner;

public class SomeArrays {


    /*
     * Arrays are fixed in size.
     * Arrays have sequential index ordering.
     * */

    // TODO: Declare Array Variables
    // TODO: Create Arrays
    // TODO: Processing Arrays


    /* FIELDS */
    String[] classRoster;
    String[] teamRoster = new String[4];
    String[] trafficLightColors = {"red", "yellow", "green"};

    /* METHODS */
    public void display() {

        // Add elements to an array
        Scanner input = new Scanner(System.in);

        // User enters team roster
        for (int i = 0; i < teamRoster.length; i++) {
            System.out.print("Name " + i + ": ");
            teamRoster[i] = input.next();
        }

        // Close input stream
        input.close();

        // Prints all array elements
        System.out.println("Traffic Light Colors:");
        for (int i = 0; i < trafficLightColors.length; i++) {
            System.out.println(trafficLightColors[i]);
        }

        System.out.println("Team Roster Names:");
        for (int i = 0; i < teamRoster.length; i++) {
            System.out.println(teamRoster[i]);
        }
    }

}
