package practice.controller;

/*
* The Controller is responsible for coordinating interactions
* between the View and the Model
* */

import practice.model.StudentModel;
import practice.view.StudentView;

public class StudentController {

    /* FIELDS */
    // Creating objects to reference the View and the Model
    private StudentModel theModel;
    private StudentView theView;

    /* CONSTRUCTORS */
    public StudentController(StudentModel model, StudentView view) {
        this.theModel = model;
        this.theView = view;
    }

    /* METHODS: GETTERS AND SETTERS */
    // to set a student's name in Model
    public void setStudentName(String name) {
        theModel.setName(name);
    }

    // to get a student's name in Model
    public String getStudentName() {
        return theModel.getName();
    }

    // to set a student's roll in model
    public void setStudentRoll(String roll) {
        theModel.setRoll(roll);
    }

    // to get a student's roll in model
    public String getStudentRoll() {
        return theModel.getRoll();
    }

    // to update the view
    public void displayStudentInfo() {
        /*
        * Using the View object to reference a method to print information.
        * In parameters, using the Model object to reference a method to
        * get student name and roll.
        * */
        theView.printStudentDetails(theModel.getName(), theModel.getRoll());
    }

}
