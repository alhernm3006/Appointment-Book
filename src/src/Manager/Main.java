package Manager;


import javax.security.auth.Subject;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;
        String name;
        System.out.println("Who are you?");
        name=sc.nextLine();
        Classroom c1=new Classroom(name);
        System.out.println("Choose what do u want to do.\n");

        do{
            System.out.println("\n---Classroom Gestor---");
            System.out.println("1. See classroom students.");
            System.out.println("2. See classroom teacher.");
            System.out.println("3. Add a new student.");
            System.out.println("4. Add a new student´s mark.");
            System.out.println("0. Leave.");

            option=sc.nextInt();


            switch(option){
                case 1:
                    c1.seeStudents();
                    break;
                case 2:
                    c1.seeTeacher();
                    break;
                case 3:
                    System.out.println("Introduce the student´s name.");
                    String studentName=sc.nextLine();
                    System.out.println("Introduce the subject and then mark.");
                    String subject=sc.nextLine();
                    Double mark=sc.nextDouble();
                    GradesManagement gradesManagement=new GradesManagement(studentName);
                    gradesManagement.addCourse(new Course(subject,mark));
                    c1.addStudent(gradesManagement);
                    break;
            }
        }while(option!=0);

    }
    }
