package AccessInstanceVariablesAndMethodsOfAClass;

import java.util.ArrayList;
import java.util.List;

public class ReturnExample4 {

	List display() {
		List list = new ArrayList();
		list.add("Java");
		list.add("C++");
		list.add("Python");
		return list;
	}

	public static void main(String[] args) {
		ReturnExample4 e = new ReturnExample4();
		System.out.println(e.display());
	}
}
