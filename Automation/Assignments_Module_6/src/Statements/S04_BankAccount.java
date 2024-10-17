package Statements;

import java.util.Scanner;

public class S04_BankAccount {
	

	// Custom exception class for insufficient balance
	class InsufficientBalanceException extends Exception {
	    public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}

	// Main class for handling account transactions
	public class BankAccount {
	    private static final int ACCOUNT_BALANCE = 2000;

	    public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Display the current account balance
	        System.out.println("Account balance is: " + ACCOUNT_BALANCE);

	        // Prompt the user to enter the withdraw amount
	        System.out.print("Enter withdraw amount: ");
	        int withdrawAmount = scanner.nextInt();

	        try {
	            // Attempt to withdraw the amount
	            withdraw(withdrawAmount);
	        } catch (InsufficientBalanceException e) {
	            // Handle the custom exception
	            System.out.println(e.getMessage());
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Method to withdraw amount and handle custom exception
	    public static void withdraw(int amount) throws InsufficientBalanceException {
	        if (amount > ACCOUNT_BALANCE) {
	            // Calculate the shortfall
	            int shortfall = amount - ACCOUNT_BALANCE;
	            // Throw custom exception with a message
	            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + shortfall + " Rs. to perform this transaction.");
	        } else {
	            // Deduct the amount from the balance and print confirmation
	            int newBalance = ACCOUNT_BALANCE - amount;
	            System.out.println("Transaction successful! New balance is: " + newBalance);
	        }
	    }
	}

}
