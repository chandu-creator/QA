package AccessInstanceVariablesAndMethodsOfAClass;

public class ConstructorOverloading {
	
	/*There can be multiple constructors in a class. 
	 However, the parameter list of the constructors should not be same.
	  This is known as constructor overloading.*/
	
	private int num;
	   public ConstructorOverloading() {
	      num = 6;
	   }
	   public ConstructorOverloading(int n) {
	      num = n;
	   }
	   public void display() {
	      System.out.println("The number is: " + num);
	   }

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading(20);
		obj.display();
		obj1.display();

	}

}
