public class OverloadedMethods {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        OverloadedMethods obj = new OverloadedMethods();

        // Using the add method with two integers
        int sum1 = obj.add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum1);

        // Using the add method with three integers
        int sum2 = obj.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15 is: " + sum2);

        // Using the add method with two doubles
        double sum3 = obj.add(3.5, 2.5);
        System.out.println("Sum of 3.5 and 2.5 is: " + sum3);

        // Using the concatenateStrings method with two strings
        String concatenatedString = obj.concatenateStrings("Hello, ", "World!");
        System.out.println("Concatenated string is: " + concatenatedString);
    }
}
