package practice;

import practice.controller.AttendanceController;
import practice.model.AttendanceModel;
import practice.view.AttendanceView;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AttendanceModel model = retrieveStudentsFromDatabase();

        AttendanceView view = new AttendanceView();

        AttendanceController controller = new AttendanceController(model, view);
        controller.updateStudents();

    }

    public static AttendanceModel retrieveStudentsFromDatabase() {

        AttendanceModel students = new AttendanceModel();
        AttendanceView viewStudents = new AttendanceView();
        HashMap<String, String> student = new HashMap<String, String>();

        // Initial class roster
        System.out.println("INITIAL CLASS ROSTER");
        System.out.println("--------------------");
        student.put("001", "Sasuke Uchiha");
        student.put("002", "Naruto Uzumaki");
        student.put("003", "Tobirama Senju");
        student.put("004", "Killer Bee");
        student.put("005", "Madara Uchiha");
        students.setStudents(student);
        viewStudents.printStudents(student);
        System.out.println("--------------------\n");


        // Does user need to add/remove a student?
        System.out.println("MENU");
        System.out.println("--------------------");
        System.out.println("Select an option:");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.print("Enter: ");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if (answer.equals("1")) {
            System.out.println("Enter Student ID and Name:");
            System.out.print("ID: ");
            String id = input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            student.put(id, name);
        } else if (answer.equals("2")) {
            System.out.println("Enter Student ID:");
            String id = input.nextLine();
            student.remove(id);
            students.setStudents(student);
        }
        input.close();
        return students;
    }

}