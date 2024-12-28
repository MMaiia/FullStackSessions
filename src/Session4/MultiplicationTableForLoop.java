package Session4;
import java.util.Scanner;
public class MultiplicationTableForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i  + "=" + (num * i));

        }
        scanner.close();
    }
}
