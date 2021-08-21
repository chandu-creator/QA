package conditionalStatements;

public class BreakUseInJava {
	public static void main(String args[]) {

		// First example
		/*
		 * while (true) { System.out.println("Hi Chandu"); break;
		 */
		// second example
		/*
		 * int i = 0; while (i < 3) { System.out.println("Hi"); i++; break;
		 */
		//third example 
		int [] numbers = {10,20,30,40,50};
		for(int i=0;i<numbers.length; i++) {
			if (numbers[i]==30) {
				break;
			}
			System.out.println(numbers[i]);
		}
	}
}
		
