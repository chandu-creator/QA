package Staticpackage;

public class StaticBlockDemo {

	static {
		System.out.println("static block is invoked");
	}

	public static void main(String args[]) {
		System.out.println("Hello main");
	}
}