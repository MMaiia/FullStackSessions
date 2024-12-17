package Session3;
import java.util.Scanner;
public class StudentAgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         while(true) {
            System.out.println("Enter #");
            int age = scanner.nextInt();
            if (age >= 0 && age <= 100) {
                System.out.println("Valid age");
            } else {
                System.out.println("Invalid age");
            }
// In this example we use if/else to ryn adn test your age, while the while loop's purpose is it
// run and display same question over and over again
        }
    }
}
