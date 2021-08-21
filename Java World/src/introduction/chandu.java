package introduction;

public class chandu {

	int a;
	String b;
	public chandu (int sum, String name) {
		this.a = sum;
		this.b = name;
	
    }
	public void chandu() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
	chandu obj = new chandu(100 ,"chandrakanth");
	chandu obj1 = new chandu(200 ,"Avvaru chandrakanth");
	System.out.println(obj.a+" "+obj.b);
	System.out.println(obj1.a+" "+obj1.b);
	System.out.println(obj1.a+" "+obj.b);
	obj.chandu();

	}

}
