package Session13;

class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void displayContentsType() {
        System.out.println("The content type: " + content.getClass().getName());
    }
}


public class GenericExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box();
        stringBox.setContent("Hello generics");
        System.out.println("In the box: " + stringBox.getContent());
        stringBox.displayContentsType();

        Box<Integer> integerBox = new Box();
        integerBox.setContent(100);
        System.out.println("In the bos: " + integerBox.getContent());
        integerBox.displayContentsType();




    }
}
