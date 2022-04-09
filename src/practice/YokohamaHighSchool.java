package practice;

import java.util.Scanner;

public class YokohamaHighSchool {

    /* FIELDS */
    private String student;
    private final int classSize = 10;
    private String[] classRoster = new String[classSize];

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
        String lineBreak = "------------------\n";

        System.out.println("ENTER STUDENT NAMES");
        System.out.println("Enter 'x' to quit\n");
        System.out.println(lineBreak);

        String[] roster = new String[classSize];
        for (int i = 0; i < classRoster.length; i++) {

            // user enters student name
            System.out.print("Student " + i + ": ");
            String name = input.next();

            // quit loop
            if (name.equals("x")) {
                break;
            }

            setStudent(name);

            // add name to roster
            roster[i] = getStudent();
            setClassRoster(roster);
        }
        input.close();

        System.out.println(lineBreak);
    }

    public void displayClassRoster() {

        String lineBreak = "------------------\n";

        System.out.println("CLASS ROSTER");
        System.out.println(lineBreak);

        for (int i = 0; i < classRoster.length; i++) {
            System.out.println("Student " + i + ": " + classRoster[i]);
        }
        System.out.println(lineBreak);

    }

}
