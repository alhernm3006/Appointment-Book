package Manager;

public class Course {
    private String name;
    private double mark;

    public Course(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void show(){
        System.out.println("The course name is " + name+" and its mark is " + mark);
    }

}
