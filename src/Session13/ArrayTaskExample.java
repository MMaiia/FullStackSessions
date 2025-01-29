package Session13;

import java.util.HashMap;

public class ArrayTaskExample {
    public static void main(String[] args) {
        String[] words = {"orange", "apple", "banana", "apple", "apple", "banana"};
        HashMap<String, Integer> wordsCounter = new HashMap<>();
        for (String word : words) {
            if(wordsCounter.containsKey(word)) {
                int counter = wordsCounter.get(word) + 1;
                wordsCounter.put(word, counter);
                System.out.println(counter);
            } else {
                wordsCounter.put(word, 1);


            }
        }


        System.out.println(wordsCounter);
    }
}
