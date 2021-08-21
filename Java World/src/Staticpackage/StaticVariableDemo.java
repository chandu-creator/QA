package Staticpackage;

public class StaticVariableDemo {

	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	// constructor

	StaticVariableDemo(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	// Test class to show the values of objects
	public static void main(String args[]) {
		StaticVariableDemo s1 = new StaticVariableDemo(111, "Karan");
		StaticVariableDemo s2 = new StaticVariableDemo(222, "Aryan");
		// we can change the college of all objects by the single line of code
		StaticVariableDemo.college = "GLOBAl";
		s1.display();
		s2.display();
	}
}