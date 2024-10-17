package Array;

import java.util.Scanner;

public class A6 {
	public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the element to update: ");
        int oldValue = scanner.nextInt();
        
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Array after update:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }
        
        
        scanner.close();
    }

}
