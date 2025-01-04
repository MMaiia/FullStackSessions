package Session5;
import java.util.Scanner;
public class SearchNumber {
    public static void main(String[] args) {
         int[] num = {24,54,67,54,32,33,47,39};
         Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number you want to search: ");
            int search = scanner.nextInt();

            for (int i = 0; i < num.length; i++) {
                if (num[i] == search) {
                    System.out.println("Number found at index: " + (i + 1));
                    //break;

    }
}
}
}
