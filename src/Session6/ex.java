package Session6;
import java.util.Scanner;
import java.util.ArrayList;

public class ex {

    static class Student {
        int studentId;
        String firstname;
        String lastname;
        int studentage;

        Student(int x, String fname, String lname, int age) {
            this.studentId = x;
            this.firstname = fname;
            this.lastname = lname;
            this.studentage = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

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
                    boolean idExists = false;
                    System.out.println("Enter student's id: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

//                    for (Student student : students) {
//                        if (student != null && student.studentId == studentId) {
//                            idExists = true;
//                            break;
//                        }
//                    }
                    try {
                        students.get(studentId);
                        idExists = true;
                        break;
                    } catch (IndexOutOfBoundsException e) {

                    }

                    if (idExists) {
                        System.out.println("Student ID " + studentId + " already exists. Please enter a unique ID.");
                    } else {
                        System.out.println("Enter student's first name: ");
                        String firstname = scanner.nextLine();

                        System.out.println("Enter student's last name: ");
                        String lastname = scanner.nextLine();

                        System.out.println("Enter student's age: ");
                        int studentage = scanner.nextInt();

                        Student student = new Student(studentId, firstname, lastname, studentage);
                        students.add(student);
                        System.out.println("Information saved successfully!");
                    }
                    break;
                case 2:
                    boolean hasStudents = false;
                    for (Student student : students) {
                        if (student != null) {
                            hasStudents = true;
                            System.out.println("========Student Details========");
                            System.out.println("Student ID: " + student.studentId);
                            System.out.println("First Name: " + student.firstname);
                            System.out.println("Last Name: " + student.lastname);
                            System.out.println("Age: " + student.studentage);
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
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i) != null && students.get(i).studentId == id) {
                            students.remove(i);
                            found = true;
                            System.out.println("Student deleted successfully!");
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