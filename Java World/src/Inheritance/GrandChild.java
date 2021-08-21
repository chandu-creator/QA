package Inheritance;

public class GrandChild extends Practices{
	
	protected void Straming() {
		System.out.println("Iam streaming method from Grand child class");
	}
	/*public static void main(String[] args) {
		ParentDemo a1,a2,a3;
		a1 = new ParentDemo();
		a1.Straming();
		a2= new Practices();
		a2.Straming();
		a3= new GrandChild(); cv
		x
		a3.Straming();
	}*/
		
	public static void main(String[] args) {
		 
		ParentDemo	a= new ParentDemo();
		a.Straming();
		a= new Practices();
		a.Straming();
		a= new GrandChild();
		a.Straming();
		
	}	
	
	
}
