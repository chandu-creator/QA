package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String args[]) {

		LinkedList<String> Lynky = new LinkedList<String>();
		Lynky.add("Ravi");
		Lynky.add("Vijay");
		Lynky.add("Ravi");
		Lynky.add("Ajay");

		Iterator<String> itr = Lynky.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
