package practice;

import practice.controller.StudentController;
import practice.model.StudentModel;
import practice.view.StudentView;

public class Main {

    public static void main(String[] args) {

        // Fetch student record based on his roll from database
        StudentModel model = retrieveStudentFromDatabase();

        // Create view to write student details in console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.displayStudentInfo();

        // Update model data
        controller.setStudentName("Lee");

        controller.displayStudentInfo();

    }

    private static StudentModel retrieveStudentFromDatabase() {
        // Create a new object
        StudentModel student = new StudentModel();

        // Set student information
        student.setName("Sana");
        student.setRoll("Class President");

        // Returns the object
        return student;
    }

}