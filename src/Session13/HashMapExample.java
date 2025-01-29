package Session13;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentGrades = new HashMap<>();
        studentGrades.put(101, "C");
        studentGrades.put(102, "A");
        studentGrades.put(103, "B");

        System.out.println("Grades: " + studentGrades);

        studentGrades.put(102, "A+");
        System.out.println("Grades: " + studentGrades);
        studentGrades.put(null, "Empty");
        System.out.println("Grades: " + studentGrades);

        //retrieve data
        System.out.println("Student 102 grade:" + studentGrades.get(102));

        //check key
        System.out.println("student 102 found: " + studentGrades.containsKey(102));

        //delete
        studentGrades.remove(102);
        System.out.println("Grades: " + studentGrades);

        //iterate
        for (HashMap.Entry<Integer, String> student : studentGrades.entrySet()) {
            System.out.println(student.getValue());
        }

    }
}
