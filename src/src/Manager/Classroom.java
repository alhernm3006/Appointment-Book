package Manager;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<GradesManagement> students;


    public Classroom() {
        this.students=new ArrayList<>();
    }

    public void addStudent(GradesManagement student) {
        this.students.add(student);
    }

    public void seeStudents() {
        for (GradesManagement student : students) {
            System.out.println(student.getStudentName());
        }
    }
}
