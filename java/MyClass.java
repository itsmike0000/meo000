public class MyClass {
    private int number;
    private String text;

    // Default Constructor
    public MyClass() {
        this.number = 0;
        this.text = "Default";
    }

    // Overloaded Constructor
    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Copy Constructor
    public MyClass(MyClass original) {
        this.number = original.number;
        this.text = original.text;
    }

    // Getter methods
    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public static void main(String[] args) {
        // Using default constructor
        MyClass obj1 = new MyClass();
        System.out.println("Using default constructor:");
        System.out.println("Number: " + obj1.getNumber());
        System.out.println("Text: " + obj1.getText());

        // Using overloaded constructor
        MyClass obj2 = new MyClass(10, "Overloaded");
        System.out.println("\nUsing overloaded constructor:");
        System.out.println("Number: " + obj2.getNumber());
        System.out.println("Text: " + obj2.getText());

        // Using copy constructor
        MyClass obj3 = new MyClass(obj2);
        System.out.println("\nUsing copy constructor:");
        System.out.println("Number: " + obj3.getNumber());
        System.out.println("Text: " + obj3.getText());
    }
}
