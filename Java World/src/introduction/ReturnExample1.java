package introduction;

public class ReturnExample1 {

		public int add() { // without arguments
		      int x = 30;
		      int y = 70;
		      int z = x+y;
		      return z;
		   }
		public int addition(int a, int b) { // with arguments
		      int c = a+b;
		      return c;
		}
		   public static void main(String args[]) {
			   ReturnExample1 test = new ReturnExample1();
		      int add = test.add();
		      int addition = test.addition(10, 20);
		      System.out.println("The sum of x and y is: " + add);
		      System.out.println("The sum of x and y is: " + addition);
		      		   }
	}


