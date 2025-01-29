package Session15;

import java.util.ArrayList;
import java.util.List;

public class ComplexityExample {
    public static void main(String[] args) {
        System.out.println(getFullName("MAIIAMIAAIMIA ", "MOZMOZMOZ"));

        List<String> fname = new ArrayList<>();
        fname.add("Tim");
        fname.add("JOhn");
        fname.add("Doe");

        fname = concat(fname);
        for (String f : fname) {
            System.out.println(fname);

        }
    }

    private static String getFullName(String firstName, String lastName) {
        return firstName + lastName;
    }
    public static List<String> concat(List<String> firstName) {
        List<String> concat = new ArrayList<>();
        for (String fname : firstName) {
            concat.add("Sr " + fname);
        }
        return concat;

    }
}
