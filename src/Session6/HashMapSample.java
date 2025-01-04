package Session6;
import java.util.HashMap;
public class HashMapSample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<>();
        studentList.put(1, "Maiia");
        studentList.put(25, "Clad");
        studentList.put(3, "kat");
        studentList.put(4, "dog");
        studentList.put(5, "fog");
        System.out.println(studentList);
        studentList.put(2, "Maiia");
        System.out.println(studentList);
        System.out.println(studentList.get(3));
        studentList.remove(3);
        System.out.println(studentList);
        System.out.println(studentList.containsValue("Maiia"));







    }


}
