public class staticmethods{

    // Static method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to subtract two integers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method to divide two integers
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Calling static methods without creating an object
        int sum = staticmethods.add(5, 3);
        System.out.println("Sum: " + sum);

        int difference = staticmethods.subtract(10, 4);
        System.out.println("Difference: " + difference);

        int product = staticmethods.multiply(6, 7);
        System.out.println("Product: " + product);

        double divisionResult = staticmethods.divide(15, 3);
        System.out.println("Division Result: " + divisionResult);
    }
}
