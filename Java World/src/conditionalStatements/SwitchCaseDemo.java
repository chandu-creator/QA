package conditionalStatements;

public class SwitchCaseDemo {

	public static void main(String args[]) {
		int i = 5;
		switch (i) {
		case 0:
			System.out.println("i is zero.");
			break;
		case 1:
			System.out.println("i is one.");
			break;
		case 9:
			System.out.println("i is two.");
			break;
		default:
			System.out.println("i is greater than 2.");
		}
	}
}

/*
Syntax:
switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}*/