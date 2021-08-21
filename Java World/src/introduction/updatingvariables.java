package introduction;

public class updatingvariables {

	int instancevariable = 100;
	static String staticvaribale = " chandu";
	public static void main(String[] args) {
		updatingvariables obj = new updatingvariables();
		int localvariable = 200;
		System.out.println(updatingvariables.staticvaribale);
		System.out.println(localvariable);
	    System.out.println(obj.instancevariable);
		obj.staticvaribale ="chandrakanth";
		obj.instancevariable = 200;
		localvariable = 300;
		System.out.println(staticvaribale);
		System.out.println(localvariable);
		System.out.println(obj.instancevariable);

	}

}
