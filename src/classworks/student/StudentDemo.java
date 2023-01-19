package classworks.student;

import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input student's name");
        String name = sc.nextLine();
        System.out.println("Please input student's surname");
        String surname = sc.nextLine();
        System.out.println("Please input student's email");
        String email = sc.nextLine();
        System.out.println("Please input student's phone number");
        String phoneNumber = sc.nextLine();
        System.out.println("Please input student's course name");
        String courseName = sc.nextLine();
        Student student = new Student(name, surname, phoneNumber, email, courseName);
        System.out.println("Student" + student.name + "Registered");
    }

}
