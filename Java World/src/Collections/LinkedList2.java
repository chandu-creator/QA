package Collections;

import java.util.LinkedList;

public class LinkedList2 {

//Here, we see different ways to add elements.
	public static void main(String args[]) {
		LinkedList<String> lynky = new LinkedList<String>();
		System.out.println("Initial list of elements: " + lynky);
		lynky.add("Ravi");
		lynky.add("Vijay");
		lynky.add("Ajay");
		System.out.println("After invoking add(E e) method: " + lynky);
		// Adding an element at the specific position
		lynky.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + lynky);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Sonoo");
		ll2.add("Hanumat");
		// Adding second list elements to the first list
		lynky.addAll(ll2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + lynky);
		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("John");
		ll3.add("Rahul");
		// Adding second list elements to the first list at specific position
		lynky.addAll(1, ll3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + lynky);
		// Adding an element at the first position
		lynky.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: " + lynky);
		// Adding an element at the last position
		lynky.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: " + lynky);

	}
}
