package Staticpackage;

public class StaticVariableUseDemo {

	static int count = 0;// will get memory only once and retain its value

	StaticVariableUseDemo() {
		count++;// incrementing the value of static variable
		System.out.println(count);
	}

	public static void main(String args[]) {
		// creating objects
		StaticVariableUseDemo c1 = new StaticVariableUseDemo();
		StaticVariableUseDemo c2 = new StaticVariableUseDemo();
		StaticVariableUseDemo c3 = new StaticVariableUseDemo();
	}
}
