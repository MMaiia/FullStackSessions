package Session3;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ifSample {
    public static void main(String[] args) {
        //System.out.println("if statement");

        // Score 90 or above is A
        // Score 80 to 89 is B
        // Score 70 to 79 is C
        // Score 60 to 69 is D
        // Score 60 or below is F

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();


        if (score >= 90) {
            System.out.println("Greade A");
        } else if (score >= 80) {
            System.out.println("Greade B");
        } else if (score >= 70) {
            System.out.println("Greade C");
        } else if (score >= 60) {
            System.out.println("Greade D");
        } else {
            System.out.println("Greade F");

            }
            scanner.close();
        }
    }

