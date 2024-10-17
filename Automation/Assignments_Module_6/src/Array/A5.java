package Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A5 {
	public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
        System.out.println("Using enhanced for-loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nUsing forEach with lambda expression:");
        list.forEach(fruit -> System.out.println(fruit));
    }
}
