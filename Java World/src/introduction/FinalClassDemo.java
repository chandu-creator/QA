package introduction;

public final class FinalClassDemo {

	final int sum = 100;
	final String Name = "Chandu";

	public FinalClassDemo(int Total) {
		this.sum = Total;
	}

	public void Normalmethod(int count) {
		this.sum = count;
		final int a = 50;
		a = 100;
		System.out.println(a);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		FinalClassDemo obj = new FinalClassDemo(25);
		obj.Normalmethod(30);

	}

}
