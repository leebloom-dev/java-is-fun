package practice;

import java.util.Scanner;

public class YokohamaHighSchool {

    /* FIELDS */
    private String student;
    private String[] classRoster = new String[10];

    /* CONSTRUCTORS */
    public YokohamaHighSchool() {
    }

    /* METHODS: GETTERS AND SETTERS */
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String[] getClassRoster() {
        return classRoster;
    }

    public void setClassRoster(String[] classRoster) {
        this.classRoster = classRoster;
    }

    /* METHODS */
    public void createRoster() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Names.");
        System.out.println("Enter 'x' to quit.");

        // Get student names
        for (int i = 0; i < classRoster.length; i++) {

            System.out.print("Enter name for student " + i + ": ");
            String name = input.next();

            if (name.equals("x")) {
                break;
            }

        }

        // Close input stream
        input.close();

    }

    public void displayClassRoster() {

        for (String name : classRoster) {
            System.out.println(name);
        }

    }

}
