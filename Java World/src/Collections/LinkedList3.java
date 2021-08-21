package Collections;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList<String> lyncky = new LinkedList<String>();
		lyncky.add("Ravi");
		lyncky.add("Vijay");
		lyncky.add("Ajay");
		lyncky.add("Anuj");
		lyncky.add("Gaurav");
		lyncky.add("Harsh");
		lyncky.add("Virat");
		lyncky.add("Gaurav");
		lyncky.add("Harsh");
		lyncky.add("Amit");
		System.out.println("Initial list of elements: " + lyncky);
		// Removing specific element from arraylist
		lyncky.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + lyncky);
		// Removing element on the basis of specific position
		lyncky.remove(0);
		System.out.println("After invoking remove(index) method: " + lyncky);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Hanumat");
		// Adding new elements to arraylist
		lyncky.addAll(ll2);
		System.out.println("Updated list : " + lyncky);
		// Removing all the new elements from arraylist
		lyncky.removeAll(ll2);
		System.out.println("After invoking removeAll() method: " + lyncky);
		// Removing first element from the list
		lyncky.removeFirst();
		System.out.println("After invoking removeFirst() method: " + lyncky);
		// Removing first element from the list
		lyncky.removeLast();
		System.out.println("After invoking removeLast() method: " + lyncky);
		// Removing first occurrence of element from the list
		lyncky.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking removeFirstOccurrence() method: " + lyncky);
		// Removing last occurrence of element from the list
		lyncky.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: " + lyncky);

		// Removing all the elements available in the list
		lyncky.clear();
		System.out.println("After invoking clear() method: " + lyncky);
	}
}
