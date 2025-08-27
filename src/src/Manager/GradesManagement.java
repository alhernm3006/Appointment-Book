package Manager;

import java.util.ArrayList;
import java.util.List;

public class GradesManagement {
    private List<Course> list;

    public GradesManagement(String name) {
        this.list = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        list.add(course);
    }

    public void showCourse() {
        for (Course course : list) {
            course.show();
        }
    }

    public void average() {
        double sum = 0;
        for(Course c: list) {
            sum += c.getMark();
        }
        System.out.println( "The average grade is "+ sum/list.size());
    }
}
