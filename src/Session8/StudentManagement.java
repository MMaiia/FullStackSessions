package Session8;

import Session8.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("===== Student Menu =====");
            System.out.println("1. Enter student details");
            System.out.println("2. Display student details");
            System.out.println("3. Delete student");
            System.out.println("4. Edit student");
            System.out.println("5. Display student count");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter student first name: ");
                    String firstName = scanner.next();

                    System.out.println("Enter student last name: ");
                    String lastName = scanner.next();

                    System.out.println("Enter student age: ");
                    int studentAge = scanner.nextInt();

                    System.out.println("Enter student major: ");
                    String major = scanner.next();

                    try {
                        Student student = new Student(firstName, lastName, studentAge, major);
                        students.add(student);
                        System.out.println("Information saved successfully: " + student.toString());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    for (Student s : students) {
                        System.out.println("===SUMMARY===");
                        System.out.printf("ID: %-10d F-name: %-20s L-name: %-20s Age: %-5d Major: %-10s%n",
                                s.getStudentId(), s.getFirstName(), s.getLastName(), s.getStudentAge(), s.getMajor());
                        System.out.println("=============");
                    }
                    break;
                case 3:
                    System.out.println("Enter student id to delete: ");
                    int id = scanner.nextInt();
                    boolean idExists = false;
                    for (Student s : students) {
                        if (s.getStudentId() == id) {
                            students.remove(s);
                            idExists = true;
                            System.out.println("Student deleted successfully");
                            break;
                        }
                    }
                    if (!idExists) {
                        System.out.println("Student with id " + id + " does not exist");
                    }
                    break;
                case 4:
                    System.out.println("Enter student id to edit: ");
                    int idToEdit = scanner.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getStudentId() == idToEdit) {
                            System.out.println("Enter new first name: ");
                            s.setFirstName(scanner.next());
                            System.out.println("Enter new last name: ");
                            s.setLastName(scanner.next());
                            System.out.println("Enter new age: ");
                            s.setStudentAge(scanner.nextInt());
                            System.out.println("Enter new major: ");
                            s.setMajor(scanner.next());
                            System.out.println("Student updated");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with id " + idToEdit + " not found");
                    }
                    break;
                case 5:
                    System.out.println("Total number of students: " + Student.getStudentCount());
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}