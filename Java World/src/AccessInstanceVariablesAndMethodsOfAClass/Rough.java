package AccessInstanceVariablesAndMethodsOfAClass;

public class Rough {
	int a = 30;

	private Rough() {
		this.a = 50;
		System.out.println("hello All");
	}

	public void hero(int a) {
		this.a = 250;
		System.out.println(a);

	}

	public int salary() {

		return 100;
	}

	public static void main(String[] args) {
		Rough obj = new Rough();
		System.out.println(obj.a);
		obj.hero(150);
		System.out.println(obj.salary());

	}

}
