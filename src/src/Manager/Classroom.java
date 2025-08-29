package Manager;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<GradesManagement> students;
    String teacher;


    public Classroom(String teacher) {
        this.students=new ArrayList<>();
        this.teacher=teacher;
    }

    public void addStudent(GradesManagement student) {
        this.students.add(student);
    }

    public void seeStudents() {
        for (GradesManagement student : students) {
            System.out.println(student.getStudentName());
        }
    }

    public String getTeacher() {
        return teacher;
    }
    public void seeTeacher() {
        System.out.println(this.getTeacher());
    }
}
