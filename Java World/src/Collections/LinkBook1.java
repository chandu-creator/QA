package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkBook1 {

	public static void main(String[] args) {
		// Creating list of Books
		List<LinkBook> list = new LinkedList<LinkBook>();
		// Creating Books
		LinkBook b1 = new LinkBook(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		LinkBook b2 = new LinkBook(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		LinkBook b3 = new LinkBook(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (LinkBook b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
