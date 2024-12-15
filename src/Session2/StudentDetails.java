package Session2;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Student identifier
        // first name
        // last name
        // age

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter your first name: ");
        String firstname = scanner.next();
        System.out.println("Enter your last name: ");
        String lastname = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();


        System.out.println(" \n====== Srudent Details ======");
        System.out.println("Student ID: " + id);
        System.out.println("First Name: " + firstname + " " + lastname);
        System.out.println("Age: " + age);
        System.out.println(" ====== Srudent Details ======");
        scanner.close();





    }
}