package Session5;
import java.util.Random;
import java.util.Scanner;

public class MatrixExample {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        Random random = new Random();

        // Fill the matrix with random integers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100); // Generates random integers between 0 and 99
            }
        }

        // Print the matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int search = scanner.nextInt();
        boolean found = false;

        // Search for the number and replace it with -10 if found
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == search) {
                    matrix[i][j] = -10;
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Number found and replaced with -10.");
        }
        if (!found) {
            System.out.println("Number not found.");
        }

        // Print the updated matrix
        System.out.println("Updated matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}