package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String args[]) {

		LinkedList<String> lynky = new LinkedList<String>();
		lynky.add("Ravi");
		lynky.add("Vijay");
		lynky.add("Ajay");
		// Traversing the list of elements in reverse order
		Iterator i = lynky.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
