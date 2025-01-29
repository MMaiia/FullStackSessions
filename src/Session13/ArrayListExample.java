package Session13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();

        list.add("One");
        list.add("two");
        list.add("three");

        // get by index
        System.out.println("Element at index 1: " + list.get(1));


        //delete an element
        list.remove(1);
        System.out.println("List is: " + list);

        for (String number : list) {
            System.out.println(number);
      }
    }
}
