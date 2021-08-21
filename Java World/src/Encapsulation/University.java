package Encapsulation;

public class University {

	public static void main(String[] args) {

		College acc = new College();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("Sonoo Jaiswal");
		acc.setEmail("sonoojaiswal@javatpoint.com");
		acc.setAmount(500000f);
		acc.setTotal(5000);
		// getting values through getter methods
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount() + " "
				+ acc.getTotal());

		EncapPractice obj = new EncapPractice();
		obj.setName("Chandu");
		obj.setScore(100);
		obj.setGrade("Pass");
		obj.setResult("Distinction");
		
		System.out.println(obj.getName() + " " + "scored" + " " + obj.getScore()+obj.grade+" "+obj.getGrade()+obj.getResult());
	}

}
