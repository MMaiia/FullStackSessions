package Session8;

public class Student {
    private static int studentCount = 0;
    private static int nextId = 1;

    private int studentId;
    private String firstName;
    private String lastName;
    private int studentAge;
    private String major;

    public Student(String firstName, String lastName, int studentAge, String major) {
        if (studentAge < 18 || studentAge > 150) {
            throw new IllegalArgumentException("Age must be between 18 and 150");
        }
        if (!major.equals("art") && !major.equals("econ") && !major.equals("math")) {
            throw new IllegalArgumentException("Major must be one of: art, econ, math");
        }

        this.studentId = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAge = studentAge;
        this.major = major;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if (studentAge < 18 || studentAge > 150) {
            throw new IllegalArgumentException("Age must be between 18 and 150");
        }
        this.studentAge = studentAge;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (!major.equals("art") && !major.equals("econ") && !major.equals("math")) {
            throw new IllegalArgumentException("Major must be one of: art, econ, math");
        }
        this.major = major;
    }

    @Override
    public String toString() {
        return String.format("Student[id=%d, firstName=%s, lastName=%s, age=%d, major=%s]",
                studentId, firstName, lastName, studentAge, major);
    }
}




