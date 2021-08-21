package OopsConcepts;

public class MethodOverloadingDemo {

	
	//You can have any number of main methods in a class by method overloading
	//But JVM calls main() method which receives string array as arguments only. Let's see the simple example//
	
	/*public static void main(String[] args) {
		System.out.println("main with String[]");
	}
	public static void main(String args) {
		System.out.println("main with String");
	}
	public static void main() {
		System.out.println("main without args");

	}*/
	
	public static void main(String[] args) {
		
		MethodType1(100,"OverloadingType1");
		MethodType1("Changed the sequence of datatypes",100);
		MethodType1(84,"Changed the datatype of parameters");
		MethodType1(84,"Increasing the data type","Smiles");
	}
	
		
		public static void MethodType1(int a, String b) {
			
			System.out.println(a+"  " + b);
		}
			
		public static void MethodType1(String b, int a) {
				
				System.out.println(a+"  " + b);
		}
         
		public static void MethodType1(boolean a, String b) {
			
			System.out.println(a+"  " + b);
		}
		
       public static void MethodType1(int a, String b, String c) {
			
			System.out.println(a+"  " + b);
		}

}


	



