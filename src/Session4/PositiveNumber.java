package Session4;
import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int number;
    do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Please enter a positive number");
            } else {
                System.out.println("The number is: " + number);
                break;
            }
        } while (number < 0);
        scanner.close();
        }


        }

