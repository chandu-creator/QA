package introduction;

public class hai {
	public int Sum;
	private String studentname;
	protected String collegename;

	public hai(int x, String Y, String Z) {
		this.Sum = x;
		this.studentname = Y;
		this.collegename = Z;
		
	}
	

	public static void main(String[] args) {

		hai obj = new hai(100,"chandu","Global");
		System.out.println(obj.Sum + " " + obj.studentname + " " + obj.collegename);
		
	}

}
