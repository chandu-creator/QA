package Arrays;

import java.util.ArrayList;

public class ArrayLengthVsSize {

	public static void main(String[] args) {

		/* creating an array A[] for 10 elements */
		String A[] = new String[10];

		/* store 2 elements */
		A[0] = "Hello";
		A[1] = "Geeks!";

		/* print length of array A[] */
		System.out.println(A.length);
		// 10

		/* Creating an ArrayList */
		ArrayList<String> al = new ArrayList<String>(10);

		/* add 3 elements */
		al.add("G");
		al.add("F");
		al.add("G");

		/* print size of ArrayList */
		System.out.println(al.size()); // 3
	}
}
