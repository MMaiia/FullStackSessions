package Session5;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        int reversed [] = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];

        }
        for (int i = 0; i < reversed.length; i++) {
            System.out.println(reversed[i]);
        }
}
}

