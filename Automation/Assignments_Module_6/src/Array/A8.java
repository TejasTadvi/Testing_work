package Array;

public class A8 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
        int[] copiedArray = new int[originalArray.length];
        
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        
        System.out.println("Copied array using System.arraycopy:");
        for (int value : copiedArray) {
            System.out.print(value + " ");
        }
    }

}
