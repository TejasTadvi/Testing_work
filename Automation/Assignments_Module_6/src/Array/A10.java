package Array;

public class A10 {
	    public static void main(String[] args) {
	        int[] array = {10, 5, 20, 8, 15};

	        System.out.println("Original array:");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();

	        int secondLargest = findSecondLargest(array);

	        if (secondLargest != Integer.MIN_VALUE) {
	            System.out.println("The second largest element is: " + secondLargest);
	        } else {
	            System.out.println("The array does not have enough distinct elements.");
	        }
	    }

	    public static int findSecondLargest(int[] array) {
	        if (array.length < 2) {
	            return Integer.MIN_VALUE; 
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int value : array) {
	            if (value > largest) {
	                secondLargest = largest;
	                largest = value;
	            } else if (value > secondLargest && value < largest) {
	                secondLargest = value;
	            }
	        }

	        return secondLargest;
	    }
	

}
