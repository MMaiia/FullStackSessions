package Session2;
import java.util.Scanner;
public class StudentInput {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputDetails();
        student.displayStudent();
    }
}

class Student {
    int id;
    String firstname;
    String lastname;
    int age;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        id = scanner.nextInt();
        System.out.println("Enter your first name: ");
        firstname = scanner.next();
        System.out.println("Enter your last name: ");
        lastname = scanner.next();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        scanner.close();

    }
public void displayStudent() {
    System.out.println(" \n====== Srudent Details ======");
    System.out.println("Student ID: " + id);
    System.out.println("First Name: " + firstname + " " + lastname);
    System.out.println("Age: " + age);
    System.out.println(" ====== Srudent Details ======");}
}
