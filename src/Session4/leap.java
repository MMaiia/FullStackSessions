package Session4;
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("Cool");
        } else {
            System.out.println("Not cool");

        }
    }
}
