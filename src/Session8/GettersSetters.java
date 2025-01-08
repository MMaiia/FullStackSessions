package Session8;

import org.w3c.dom.ls.LSOutput;

public class GettersSetters {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstname("");
        p.setage(9);
        System.out.println(p.getFirstname());


    }
}
class Person {
    private String firstname;
    private String lastname;
    private int age;

    public void setage(int age) {
        if (age < 0) {
            System.out.println("Invslid age");
        } else {
            this.age = age;

        }


        this.age = age;
    }

    public int getage() {
        return age;
    }


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