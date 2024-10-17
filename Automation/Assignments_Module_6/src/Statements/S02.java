package Statements;

public class S02 {
	 public static void main(String[] args) {
	        String[] numbers = {"10", "20", "abc", "30"};

	        for (String num : numbers) {
	            try {
	                int value = Integer.parseInt(num);
	                int result = 100 / value; 
	                System.out.println("Parsed value: " + value + ", Result: " + result);
	            } 
	            catch (NumberFormatException e) {
	                System.out.println("Exception caught: Invalid number format for string \"" + num + "\".");
	            }
	            catch (ArithmeticException e) {
	                System.out.println("Exception caught: Division by zero error.");
	            }
	            catch (Exception e) {
	                System.out.println("Exception caught: An unexpected error occurred.");
	                e.printStackTrace(); 
	            }
	        }
	    }
}
