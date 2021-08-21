package introduction;

public class StaticVariables {

	int a = 100;
	String b = "Hello";
	static int c = 200;
	static String d = "Cheppanu Brother";

	public static void main(String[] args) {

		//System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println(c + " " + d);
		StaticVariables obj = new StaticVariables();
		System.out.println(obj.a + " " + obj.b + " " + StaticVariables.c + " " + StaticVariables.d);
		System.out.println(obj.a + " " + obj.b + " " + c + " " + d);
		obj.hellomastaru();
		areyentraedi();
		obj.sahoo();
		StaticVariables.Billa();

	}

	public void hellomastaru() {
		System.out.println("hellomastaru method output :" + a + " " + b + " " + c + " " + d);
	}

	public static void areyentraedi() {
		/*System.out.println("areyentraedi method output :"+obj.a+" "+obj.b+" "+c+" "+d);*/
		System.out.println("areyentraedi method output :" + c + " " + d);
	}

	public void sahoo() {
		int a = 5;
		String b = "Prabhas";
		// static int c = 20;-- static Local variables cannot be declared in non static
		// method
		// static String d = " cool";
		System.out.println("sahoo method output :" + a + " " + b);
	}

	public static void Billa() {
		int a = 20;
		// static String b = "Be Only One";--Static local variable not allowed in a
		// class.
		System.out.println("Billa method output :" + a);
	}

}
