package Inheritance;

public class Practices extends ParentDemo {

	public static void main(String[] args) {
		ParentDemo obj = new Practices();
		obj.Straming();
		obj.Running("chandu");

		obj = new ParentDemo();
		obj.Straming();
		obj.Running("naveen");

		Practices obj1 = new Practices();

		obj1.Straming();
		Practices.Hello(10);
		Hello(20);
		obj1.Driving();
		obj1.Machine();

	}

	public void Driving() {
		super.Start(5);

		System.out.println(super.a);
		System.out.println("Iam the driving method from from child class");
	}
 //Method Hiding 
	public static void Hello(int x) {
		System.out.println("Iam a static method from child clasS" + x);
	}

	public void Machine() {
		super.Hello(35);

		System.out.println("Iam the Machine method from from child class");
	}

	/*
	 * protected void Straming() { int a =10;
	 * System.out.println("Iam streaming method from child class"+"   "+a); }
	 */

	@Override
	public void Running(String x) {
		System.out.println(" Iam Runnin method from child class" + "    " + x);
	}

	protected void Straming() {
		System.out.println("Iam streaming method from child class");

	}
}
