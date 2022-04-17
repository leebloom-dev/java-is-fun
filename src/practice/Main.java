package practice;

<<<<<<< HEAD
import practice.controller.AttendanceController;
import practice.model.AttendanceModel;
import practice.view.AttendanceView;

=======
>>>>>>> 55d9adc3f484ed4f22ba9472275817bac38a4c17
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        AttendanceModel model = retrieveStudentsFromDatabase();

        AttendanceView view = new AttendanceView();

        AttendanceController controller = new AttendanceController(model, view);
        controller.updateStudents();

    }

    public static AttendanceModel retrieveStudentsFromDatabase() {
        AttendanceModel students = new AttendanceModel();
        HashMap<String, String> student = new HashMap<String, String>();

        student.put("001", "Sasuke Uchiha");
        student.put("002", "Naruto Uzumaki");
        student.put("003", "Tobirama Senju");
        student.put("004", "Killer Bee");
        student.put("005", "Madara Uchiha");

        students.setStudents(student);

        return students;
    }

}