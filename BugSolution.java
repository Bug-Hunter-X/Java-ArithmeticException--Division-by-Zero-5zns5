public class MyClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            System.out.println(x / y); // This line may cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}