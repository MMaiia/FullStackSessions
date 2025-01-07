package Session8;

public class ExamplesClass {
    public static void main(String[] args) {

        //1. find the biggest integer using if operator
//        int a = 25;
//        int b = 30;
//        int c = 15;
//
//        if (a > b && a > c) {
//            System.out.println("big is " + a);
//
//        }
//        else if (b > a && b > c) {
//            System.out.println("big is " + b);
//        }
//        else {
//            System.out.println("big is " + c);
//
//        }


        //2. write a method tat calculates sum of all even numbers from 1 - 50 using a for loop
        sumOfnumbers ();
    }

        public static int sumOfnumbers() {
            int sum = 0;
            for (int i = 0; i <= 50; i++) {
                if (i % 2 == 0) {
                    sum += i;
                    System.out.println(sum );
            }
        }
            return sum;
    }

}


