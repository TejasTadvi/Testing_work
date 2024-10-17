package Statements;

import java.util.Scanner;

public class S03_GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their marks
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        // Determine and display the grade based on the marks
        String grade = getGrade(marks);
        System.out.println("Your grade is: " + grade);

        // Close the scanner
        scanner.close();
    }

    // Method to determine the grade based on the marks
    public static String getGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else if (marks <= 40) {
            return "Fail";
        } else {
            return "Invalid marks. Please enter a value between 0 and 100.";
        }
    }

}
