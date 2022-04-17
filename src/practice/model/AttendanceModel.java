package practice.model;

import java.util.HashMap;

public class AttendanceModel {

    /* FIELDS */
    private String id;
    private HashMap<String, String> students;

    /* METHODS: GETTERS AND SETTERS */

    public String getId() {
        return id;
    }

    public HashMap<String, String> getStudents() {
        return students;
    }

    public void setStudents(HashMap<String, String> students) {
        this.students = students;
    }


}
