package Manager;

import java.util.ArrayList;
import java.util.List;

public class GradesManagement {
    private List<Course> list;
    private String student ;

    public GradesManagement(String name) {
        this.student = name;
        this.list = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        list.add(course);
    }

    public String getStudentName() {
        return student;
    }

    public String showCourse() {
        String s = "The student is " + getStudentName()+" and the marks are: \n";
        for (Course course : list) {
            s=s+course.getName()+" and the mark is "+course.getMark()+" \n";
        }
        return s;
    }

    public void average() {
        double sum = 0;
        for(Course c: list) {
            sum += c.getMark();
        }
        System.out.println( "The average grade is "+ sum/list.size());
    }
}
