package lesson.room.service;

import lesson.room.model.Student;

import java.util.Scanner;

public class StudentService {

    public Student create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.next();
        System.out.println("enter surname");
        String surname = scanner.next();
        System.out.println("enter age");
        int year = scanner.nextInt();
        System.out.println("enter PHD");
        boolean isPHD = scanner.next() == "Yes";
        System.out.println("enter gender");
        char gender = scanner.next().charAt(0);
        System.out.println("enter mark");
        double mark = scanner.nextDouble();

        return new Student(name, surname, year, isPHD, gender, mark);
    }

    public void maxStudent(Student x, Student y) {
        if (x.getYear() < y.getYear()) {
            x.printInfo();
        } else {
            y.printInfo();
        }
    }

    public Student minStudent(Student[] students) {
        Student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getYear() > min.getYear()) {
                min = students[i];
            }
        }
        return min;
    }

    public void smallestGirl(Student[] students) {
        Student minGirl = null;
        for (Student student : students) {
            if (minGirl == null) {
                if (student.getGender() == 'F') {
                    minGirl = student;
                }
            } else if (student.getGender() == 'F' && student.getYear() > minGirl.getYear()) {
                minGirl = student;
            }
        }

        if (minGirl != null) {
            minGirl.printInfo();
        } else {
            System.out.println();
        }

    }
}
