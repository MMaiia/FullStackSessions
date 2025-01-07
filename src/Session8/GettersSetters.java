package Session8;

import org.w3c.dom.ls.LSOutput;

public class GettersSetters {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstname("");
        System.out.println(p.getFirstname());


    }
}
class Person {
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        if (firstname == "") {
            System.out.println("Please enter a valid name");
        } else {
            this.firstname = firstname;
    }
            }

}