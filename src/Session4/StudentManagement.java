package Session4;
import java.util.Scanner;

public class StudentManagement {

    static class Student {
        int studentId;
        String firstname;
        String lastname;
        int studentage;

        Student(int id, String fname, String lname, int age) {
            this.studentId = id;
            this.firstname = fname;
            this.lastname = lname;
            this.studentage = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        int studentCount = 0;

        while (true) {
            System.out.println("========Student Menu========");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Delete Account");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student's id: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    boolean idExists = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i] != null && students[i].studentId == studentId) {
                            idExists = true;
                            break;
                        }
                    }

                    if (idExists) {
                        System.out.println("Student ID already exists. Please enter a unique ID.");
                    } else {
                        System.out.println("Enter student's first name: ");
                        String firstname = scanner.nextLine();

                        System.out.println("Enter student's last name: ");
                        String lastname = scanner.nextLine();

                        System.out.println("Enter student's age: ");
                        int studentage = scanner.nextInt();

                        Student student = new Student(studentId,
                                                      firstname,
                                                      lastname,
                                                      studentage);
                        students[studentCount] = student;
                        studentCount++;
                        System.out.println("Information saved successfully!");
                    }
                    break;
                case 2:
                    boolean hasStudents = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i] != null) {
                            hasStudents = true;
                            System.out.println("========Student Details========");
                            System.out.println("Student ID: " + students[i].studentId);
                            System.out.println("First Name: " + students[i].firstname);
                            System.out.println("Last Name: " + students[i].lastname);
                            System.out.println("Age: " + students[i].studentage);
                            System.out.println("=======End========");
                        }
                    }
                    if (!hasStudents) {
                        System.out.println("No students to display.");
                    }
                    break;
                case 3:
                    System.out.println("Enter student's id to delete: ");
                    int id = scanner.nextInt();
                    boolean found = false;

                    for (int i = 0; i < studentCount; i++) {
                        if (students[i] != null && students[i].studentId == id) {
                            students[i] = null;
                            found = true;
                            System.out.println("Student deleted successfully");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}


