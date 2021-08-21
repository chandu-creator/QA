package AbstractionDemo;

public class AbstractChildOneClass extends AbstractSuperClass{

	public static void main (String [] args){

        // Here we cannot instantiate the AbstractSuperClass class but we can instantiate the AbstractChildClass class
        // Using the instance of AbstractChildClass we can access methods and data members of AbstractSuperClass class

    AbstractSuperClass obj = new AbstractChildOneClass();
		
		System.out.println("I am a data member from Super class and my value is " + obj.a);
		System.out.println("I am a data member from Super class and my value is " + obj.b);
		obj.myMethod();
		obj.myMethod(20);
		
		
	}

	@Override
	void myMethod() {

		System.out.println("I am in child class");
		
	}

}