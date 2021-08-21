package introduction;

public class ReturnStatement {

	public static void main(String[] args) {
		printAMessage();
		int addition = add(5, 8);
		System.out.println(addition);
		String shouting = caps("why are you reading my diary mom?!");
		System.out.println(shouting);

		int[] awesomeArray = gimmeArrayFromInts(3, 7, 1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);

		String[] namesoutput = namesmethod("chandu", "kanthi");
		System.out.println(namesoutput[0]);
		System.out.println(namesoutput[1]);
	}

	public static void printAMessage() {
		System.out.println("This is our first method!");
	}

	public static int add(int a, int b) {
		int sum;
		sum = a + b;
		return sum;

	}

	public static String caps(String shouting) {
		return shouting.toUpperCase();
	}

	public static int[] gimmeArrayFromInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}

	public static String[] namesmethod(String a, String b) {
		String[] names = new String[2];
		names[0] = a;
		names[1] = b;
		return names;
	}
}
