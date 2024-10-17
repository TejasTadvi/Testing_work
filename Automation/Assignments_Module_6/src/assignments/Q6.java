package assignments;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Variables to store the first two terms of the Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print the first two terms
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            // Update the first and second terms for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        // Close the scanner
        scanner.close();
    }
}
