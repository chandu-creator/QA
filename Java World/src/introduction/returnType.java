
package introduction;

public class returnType {

	public static void main(String[] args) {
		
		String output;
		String studentName;
		
		studentName = "John";
		output = findGrades(90);
		displayGrades(studentName, output);
		
		studentName = "Tom";
		output = findGrades(80);
		displayGrades(studentName, output);
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
	
	public static void displayGrades(String studentName, String output) {
		System.out.println("*******************************");
		System.out.println("Grade of " + studentName + " is: " + output);
		System.out.println("*******************************");
	}
	}


