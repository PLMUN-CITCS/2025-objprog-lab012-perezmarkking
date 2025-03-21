public class MethodDemo {
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling printMessage method
    }

    // Method to print a greeting message
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a given message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
