package Session5;

public class StaticSample {
    public static void main(String[] args) {
        String result = OddOrEven(11);
        //OddOrEven(12);
        System.out.println(result);
    }

    public static String OddOrEven(int inputnumber) {
        if (inputnumber % 2 == 0) {
            System.out.println("Result: " + inputnumber % 2);
            return "Even";
        } else {
            System.out.println("Result: " + inputnumber % 2);
            return "Odd";
        }
    }
}