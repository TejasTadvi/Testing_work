package Array;

public class A9 {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        
	        System.out.println("Original array:");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	        
	        reverseArray(array);
	        
	        System.out.println("Reversed array:");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	    }
	    
	    public static void reverseArray(int[] array) {
	        int left = 0;
	        int right = array.length - 1;
	        
	        while (left < right) {
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            
	            left++;
	            right--;
	        }
	    }
	

}
