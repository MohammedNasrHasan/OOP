


import java.util.*;
public class UseCourse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String department;

        System.out.println("Enter your course information");
        System.out.println("Department:");
        department = s.next();

        if (department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY")) {
            System.out.println("Code:");
            int code = s.nextInt();
            System.out.println("Credit:");
            int credit = s.nextInt();

            LabCourse labCourse = new LabCourse(department, code, credit);
            System.out.println(labCourse.display());
        } else {
            System.out.println("Code:");
            int code = s.nextInt();
            System.out.println("Credit:");
            int credit = s.nextInt();

            CollegeCourse collegeCourse = new CollegeCourse(department, code, credit);
            System.out.println(collegeCourse.display());
        }
    }
}