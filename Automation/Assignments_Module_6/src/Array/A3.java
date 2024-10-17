package Array;

import java.util.Scanner;

public class A3 {
	 public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the element to find its index: ");
	        int element = scanner.nextInt();
	        
	        int index = -1;
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == element) {
	                index = i;
	                break;
	            }
	        }
	        
	        if (index == -1) {
	            System.out.println("Element not found in the array.");
	        } else {
	            System.out.println("The index of element " + element + " is: " + index);
	        }
	        
	        scanner.close();
	    }

}
