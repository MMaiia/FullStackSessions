package Session7;
import java.util.Scanner;
public class ExamplesClass {
    public static void main(String[] args) {
        // // 1. Portnov = vontroP

//        String str = "Portnov";
//        int n = str.length();
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));


        //// 2. Multiplication Table
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int num = scanner.nextInt();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(num + "x" + i + "=" + (num * i));
//
//        }
//        scanner.close();

        //3. write a method that takes array of integers and finds the maximum integer from the array
        // int [] numbers = {4,3,65,76,23,110};
        int [] numbers = {4,3,65,76,23,110};
        int greatnum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatnum) {
                greatnum = numbers[i];
                System.out.println(greatnum);
            }
        }

    }
    }