package Session7.SMS;

public class Student {
            int studentId;
            String firstName;
            String lastName;
            int studentAge;
            String major;

            Student(int id, String fName, String lName, int Age, String major) {
                this.studentId = id;
                this.firstName = fName;
                this.lastName = lName;
                this.studentAge = Age;
                this.major = major;
            }
//            @Override
//            public String toString () {
//                //return this.studentId +" " +this.firstName + " " + this.lastName;
//                return String.format(": : %d, First name: %s, Last name: %s, Age: %d, Major: %s",
//                        studentId,
//                        firstName,
//                        lastName,
//                        major);
@Override
public String toString() {
    return String.format(" Studentid=%d, firstName=%s, lastName=%s, age=%d, major=%s]",
            studentId, firstName, lastName, studentAge, major);
}

    }






