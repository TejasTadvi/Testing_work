package assignments;

import java.util.Scanner;

public class Q3 {
	 public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ask the user to input a number
	        System.out.print("Enter a number to find its factorial: ");
	        int num = scanner.nextInt();
	        
	        // Variable to store the factorial result
	        long factorial = 1;
	        
	        // Calculate factorial using a for loop
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        
	        // Output the result
	        System.out.println("The factorial of " + num + " is: " + factorial);
	        
	        // Close the scanner
	        scanner.close();
	    }
}
