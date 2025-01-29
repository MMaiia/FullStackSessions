package Session11;

public class Teacher extends Person {
    String subject;

    public void teach() {
        System.out.println("I am teaching");
    }

    @Override
    public void introduce() {
        System.out.println("hi im teacher and my name is " + super.name);
    }
}
