package AccessInstanceVariablesAndMethodsOfAClass;

public class ParameterizedConstructorsDemo {

	public static void main(String args[]) {
		ParameterizedConstructors t1 = new ParameterizedConstructors(10);
		ParameterizedConstructors t2 = new ParameterizedConstructors(20);
		System.out.println(t1.x + " " + t2.x);
	}
}
