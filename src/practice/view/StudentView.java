package practice.view;

/*
* The View is responsible for displaying what the user sees.
* Its job is to pass information entered by the user to
* whomever needs it.
* */

import jdk.swing.interop.SwingInterOpUtils;

public class StudentView {

    // Method prints student information

    public void printStudentDetails(String studentName, String studentRoll) {

        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("---------------------");
        System.out.println("Name: " + studentName);
        System.out.println("Roll: " + studentRoll);

    }

}
