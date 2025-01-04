package Session7;

public class MethodSample {
    public static void main(String[] args) {
printMessage();
showgreeting("Maiia");

System.out.println(getmessage());

    }
    public static void printMessage() {
        System.out.println("Message");

    }
public static void showgreeting (String name) {
    System.out.println("Hello " + name);
}



public static String getmessage( ) {
        return "100" ;
}
}
