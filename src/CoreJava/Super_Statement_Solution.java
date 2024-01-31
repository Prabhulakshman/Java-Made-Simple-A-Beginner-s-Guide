package CoreJava;

public class Super_Statement_Solution {
	//super() statement creates the object of Super Class.
	//It should be written in the First Line of Constructor Body only.
	//If the Super Class Constructor is Parameterized then the super(parameterized) statement must be Parameterized.

	public static void main(String[] args) {
		System.out.println("main() method started");
		new Super_Statement_SubClass();
		System.out.println("main() method ended");

	}

}
