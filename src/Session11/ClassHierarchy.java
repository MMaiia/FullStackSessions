package Session11;

public class ClassHierarchy {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Student";

        Person teacher = new Teacher();
        teacher.name = "Teacher";

        Person gradStudent = new GraduateStudent();
        gradStudent.name = "Graduate Student";

        Person[] people = {student, teacher, gradStudent};

        for (Person person : people) {
            person.introduce();
        }


    }
}
