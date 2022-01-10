package week5;

import java.util.Scanner;

public class University {
    private String name;
    private int countOfStudents;
    private int maxCountOfStudents;
    private int minStudentAge;
    private int maxStudentAge;
    private String[] courses;
    private Scanner scanner = new Scanner(System.in);

    public University() {
    }

    public University(String name, int countOfStudents, int maxCountOfStudents,
                      int maxStudentAge, int minStudentAge, String[] courses) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.minStudentAge = minStudentAge;
        this.maxStudentAge = maxStudentAge;
        this.courses = courses;
    }

    public void admission() {
        printCourses();
        System.out.println("Choose course");
        int choose = scanner.nextInt();
        if (choose >= 0 && choose < courses.length) {
            System.out.println("Input your age");
            int age = scanner.nextInt();
            if (checkAge(age)) {
                if (register()) {
                    System.out.println("Successfully registered");
                } else {
                    System.out.println("No more space");
                }
            } else {
                System.out.println("Incompatible age");
            }

        } else {
            System.out.println("Invalid course number");
        }
    }
    private void printCourses(){
        for (int i = 0; i < courses.length; i++) {
            System.out.println(i + " " + courses[i]);
        }
    }

    private boolean checkAge(int age) {
        if (age > minStudentAge && age < maxStudentAge) {
            return true;
        }
        return false;
    }

    private boolean register() {
        if (countOfStudents < maxCountOfStudents) {
            countOfStudents++;
            return true;
        }
        return false;
    }

}



