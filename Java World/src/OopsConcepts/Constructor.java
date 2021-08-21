package OopsConcepts;


/*Constrcutor model 1
public class Constructor {
	
	int Total;
	String Studentname;
	
	public Constructor() {
		Total = 10;
		Studentname = "chandu";
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
	
		System.out.println(obj.Total+"   "+obj.Studentname);
		
		
		

	}
}
	
public class Constructor {
	//wrong
	int Total = 100;
	String Studentname = "Chandrakanth";
	
	public Constructor(int x, String Y) {
		this.Total = x;
        this.Studentname = Y;
 
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		System.out.println(obj.Total+ "   " +obj.Studentname);
		
		

		
		
		
	}
}







	/*Constructor model2/wrong

public class Constructor {
	
	int Total;
	String Studentname;
	
	public Constructor(int x, String Y) {
		x = Total;
		Y = Studentname;
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor(100,"Chandrakanth");
	
		System.out.println(obj.Total+"   "+obj.Studentname);
		
		
		

	}
}
*/

 

public class Constructor {
	
	int Total;
	String Studentname;
	String Sun;
	
	

	public Constructor(int x, String Y, String Z) {
		this.Total = x;
		this.Studentname = Y;
		this.Sun = Z;
	}



	public static void main(String[] args) {
		
		Constructor obj = new Constructor(100,"Chandrakanth","Goal");
	
		System.out.println(obj.Total+"   "+obj.Studentname+"  "+obj.Sun);
		
		
		

	}
}
