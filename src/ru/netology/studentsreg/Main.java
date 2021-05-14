package ru.netology.studentsreg;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashSet<Student> studentBase = new HashSet<Student>();
        createStudentByUser(studentBase);
        displayBase(studentBase);
    }

    private static void displayBase(HashSet<Student> studentBase) {
        System.out.println("Registered students:");
        for (Student student: studentBase) {
            System.out.println(student.toString());
        }
    }

    private static void createStudentByUser(HashSet<Student> studentBase) {
        Scanner myScan = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Enter student information:\n" +
                    "Full name, group number, student ID number or enter 'end' to finish the program:");
            input = myScan.nextLine();
            if (input.equals("end")) break;
            String[] studentInfo = input.split(",");
            Student student0;
            if (studentInfo.length == 3) {
                student0 = new Student(studentInfo[0], studentInfo[1], studentInfo[2]);
            } else {
                System.out.println("!!! Please, enter Full name, group number, student ID number separated by comma !!!");
                continue;
            }
            registerStudent(student0, studentBase);
        }
    }

    public static void registerStudent (Student student, HashSet<Student> studentBase) {
        if (studentBase.contains(student)) {
            System.out.println("!!! Student cannot be added. A student with such a 'student ID'=" + student.getStudentId() + " already exists");
        } else {
            studentBase.add(student);
        }

    }


}
