package Session4;
import java.util.Scanner;
public class ScannerWhileEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;

        }
        scanner.close();
    }

}


