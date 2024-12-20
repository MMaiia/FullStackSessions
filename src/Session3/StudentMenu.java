package Session3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StudentMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentid  = 0;
        String firstname = "";
        String lastname = "";
        int studentage = 0;


        while(true) {
            System.out.println("========Student Menu========");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Exit");
            System.out.println("4. Reset student data");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student's id: ");
                    studentid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter student's first name: ");
                    firstname = scanner.nextLine();

                    System.out.println("Enter student's last name: ");
                    lastname = scanner.nextLine();

                    System.out.println("Enter student's age: ");
                    studentage = scanner.nextInt();

                    System.out.println("Information saved successfully!");
                    break ;
                case 2:
                    System.out.println("========Student Details========");
                    System.out.println("Student ID: " + studentid);
                    System.out.println("First Name: " + firstname);
                    System.out.println("Last Name: " + lastname);
                     System.out.println("Age: " + studentage);
                    System.out.println("=======End========");
                    break ;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break ;
                case 4:
                    studentid = 0;
                    firstname = "";
                    lastname = "";
                    studentage = 0;
                    System.out.println("Student data reset.");
                    break ;
                default:
                     System.out.println("Invalid choice");


            }


        }
    }
}
