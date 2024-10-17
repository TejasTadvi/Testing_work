package assignments;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = scanner.nextInt();
        
        // Store the original number for later comparison
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Get the number of digits
        
        // Check if the number is Armstrong
        while (num > 0) {
            int digit = num % 10;          // Extract the last digit
            sum += Math.pow(digit, digits); // Raise the digit to the power of the number of digits
            num /= 10;                     // Remove the last digit
        }

        // Compare the sum of powers with the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
        // Close the scanner
        scanner.close();
    }

}
