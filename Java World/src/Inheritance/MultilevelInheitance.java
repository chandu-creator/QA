package Inheritance;

public class MultilevelInheitance {

	public static void main(String[] args) {
		ParentDemo a;
		a = new ParentDemo();
		a.Straming();
		a= new Practices();
        a.Straming();
		a= new GrandChild();
		a.Straming();

	}
	
	public class Practices extends ParentDemo{
		protected void Straming() {
			System.out.println("Iam streaming method from child class");
	}

	public class GrandChild extends Practices{
			protected void Straming() {
			System.out.println("Iam streaming method from Grand child class");
			}
}
	}}
