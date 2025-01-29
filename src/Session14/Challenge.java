package Session14;

import java.util.HashSet;

public class Challenge {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 8, 22, 6, 8, 1};

        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i< numbers.length; i++) {
           // boolean added = number.Set.add(numbers[i]);

            if (!numberSet.add(numbers[i])) {
                System.out.println("Duplicate found, for " + numbers[i]);
            }
        }
    }
}
