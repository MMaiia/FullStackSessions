package Session3;
import java.util.Scanner;
public class AgeCategory {
    public static void main(String[] args) {

        // < 13 is child
        // 13 to 19 is teenager
        // 20 to 59 is adult
        // 60 or above is senior


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19)  {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        //} else if (score >= 60) {
           // System.out.println("Greade D");
        } else {
            System.out.println("Senior");

    }
        scanner.close();
    }
}
