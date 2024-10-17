package Statements;

public class S01 {
	public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[5]; // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        }

        try {
            String str = null;
            int length = str.length(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Exception caught: An exception occurred.");
            e.printStackTrace(); // Print stack trace for debugging
        }
    }
}
