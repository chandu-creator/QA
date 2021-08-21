package OopsConcepts;

public class ReturnTypeDemo {

	public static void main(String[] args) {
		String Studentname, Mobile, grade,result;
		Studentname = "Chandu";
		grade ="pass";
		Mobile = exams(99);
		Results(Studentname, Mobile);
        Day(Studentname, grade);
        result = Score(80);
        Last(result);
	}
	
		public static String exams(int phonenumber) {
			 String Mobile;
			 
			 if(phonenumber>=90 && phonenumber <=95) {
				 Mobile = "A";
			 }else if(phonenumber>=96 && phonenumber<=99) {
				 Mobile = "B";
			 }else {
				 Mobile = "C";
			 }
			 return Mobile;
			 }
			 
			public static void Results(String Studentname, String Mobile ) {
				 System.out.println("The output of Results method is "+ Studentname + "    " + Mobile);
			}
	     
			public static void Day(String Studentname, String grade ) {
				 System.out.println("The output of Day method is" + Studentname + "    " + grade);
			}
			public static String Score(int Total) {
				String result;
				if(Total>=90 && Total<=100) {
					result = "Distinction";
				}else {
					result = "NotQualified";
				}
				return result;
				
			}
			public static void Last(String result) {
				
			System.out.println("The output of Last method is" + result);
			
			
	}
	}




