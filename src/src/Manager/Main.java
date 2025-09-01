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
            sc.nextLine();

            switch(option){
                case 1:
                    if(c1.getNumStudents()==0){
                        System.out.println("You have no students.");
                        break;
                    }
                    c1.seeStudents();
                    System.out.println("Do you want to see one specific classroom students? (Y/N)");
                    String choice=sc.nextLine();
                    if(choice.equalsIgnoreCase("Y")){
                        System.out.println("Enter student name: ");
                        name=sc.nextLine();
                        sc.nextLine();
                        c1.getStudent(name).showCourse();
                    }
                    break;
                case 2:
                    System.out.println("The teacher is: "  );
                    c1.seeTeacher();
                    break;
                case 3:
                    System.out.println("Introduce the student´s name.");
                    String studentName=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduce the subject.");
                    String subject=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduce the mark.");
                    Double mark=sc.nextDouble();
                    sc.nextLine();
                    GradesManagement gradesManagement=new GradesManagement(studentName);
                    gradesManagement.addCourse(new Course(subject,mark));
                    c1.addStudent(gradesManagement);
                    break;
                case 4:
                    System.out.println("Introduce the student.");
                    String studentName2=sc.nextLine();
                    sc.nextLine();
                    if(c1.getStudent(studentName2)==null){
                        System.out.println("Student not found.");
                        break;
                    }
                    System.out.println("Introduce the subject."  );
                    String subject2=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduce the mark.");
                    Double mark2=sc.nextDouble();
                    sc.nextLine();
                    c1.getStudent(studentName2).addSubject(subject2,mark2 );

            }
        }while(option!=0);

    }
    }
