package Array;

import java.util.ArrayList;
import java.util.List;

public class A7 {
	  public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        list.add("Elderberry");
	        
	        System.out.println("Original ArrayList:");
	        System.out.println(list);
	        
	        if (list.size() > 2) { 
	            list.remove(2); 
	        } else {
	            System.out.println("The list does not have a third element.");
	        }
	        
	        System.out.println("ArrayList after removing the third element:");
	        System.out.println(list);
	    }
}
