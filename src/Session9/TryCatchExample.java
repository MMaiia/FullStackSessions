package Session9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("NUmber1: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("NUmber2: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 isnt allowed");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Aplication completed");
            scanner.close();
        }
    }
}
