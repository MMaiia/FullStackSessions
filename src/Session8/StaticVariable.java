package Session8;

public class StaticVariable {
    static class Student {
        static int studentCount = 0;

        public Student() {
            studentCount++;

        }

       public static void shouwCount() {
           System.out.println("Student count: " + studentCount);
       }
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student.shouwCount();
    }
}
