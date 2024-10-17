package pattern;

public class P3 {
		public static void main(String[] args) {
	        int n = 4; 

	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < n; j++) {
	                System.out.print("   ");
	            }
	            
	            for (int k = 1; k <= i; k++) {
	                System.out.print(i + " ");
	                if (k < i) {
	                    System.out.print("   ");
	                }
	            }
	            
	            System.out.println();
	        }
	    }

}
