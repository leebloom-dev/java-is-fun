package practice.view;

import java.util.HashMap;

public class AttendanceView {

    public void printStudents(HashMap<String, String> students) {
        System.out.println("CLASS ROSTER");
        System.out.println("-------------");
        for (String id : students.keySet()) {
            System.out.println("ID: " + id + " Name: " +  students.get(id));
        }
    }

}
