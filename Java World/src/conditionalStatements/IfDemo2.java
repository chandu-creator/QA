package conditionalStatements;

public class IfDemo2 {

	public static void main(String args[]) {
		int i = 10;

		if (i > 15)
			
		// This statement will be executed
		// as if considers one statement by default
		System.out.println("I am Not in if");
		System.out.println("This statement prints only if the condition is True");
		System.out.println(i);

	}
}

/*
if(condition)
statement1;
statement2;

//Here if the condition is true, if block 
//will consider only statement1 to
 * be inside //its block
 */