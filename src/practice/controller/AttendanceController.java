package practice.controller;

import practice.model.AttendanceModel;
import practice.view.AttendanceView;

import java.util.HashMap;

public class AttendanceController {

    /* FIELDS */
    private AttendanceModel attendanceModel;
    private AttendanceView attendanceView;

    /* CONSTRUCTOR*/
    public AttendanceController(AttendanceModel model, AttendanceView view) {
        this.attendanceModel = model;
        this.attendanceView = view;
    }

    /* METHODS: GETTERS AND SETTERS */
    public void setStudents(HashMap<String, String> students) {
        attendanceModel.setStudents(students);
    }

    public HashMap<String, String> getStudents() {
        return this.attendanceModel.getStudents();
    }

    /* METHODS */
    public void updateStudents() {
        attendanceView.printStudents(attendanceModel.getStudents());
    }

}
