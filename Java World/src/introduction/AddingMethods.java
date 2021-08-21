package introduction;

public class AddingMethods {

	public static void main(String[] args) {
		String studentname;
		String output;
	dispplaygrades(studentname,score);
		output = findGrades(90);
		output = findGrades(80);
		System.out.println("Grade of " + " is: " + output);
	
	System.out.println("Grade of "  + " is: " + output);

	}
	public void dispplaygrades(String studentname,int score) {
		System.out.println(studentname+output);
	}

	public static String findGrades(int score) {

		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
		
	}
}
