package Array;

public class A4 {
	public static void main(String[] args) {
        int[] arr = {15, 22, 8, 45, 30, 4, 60};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
            if (arr[i] < min) {
                min = arr[i];  
            }
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
