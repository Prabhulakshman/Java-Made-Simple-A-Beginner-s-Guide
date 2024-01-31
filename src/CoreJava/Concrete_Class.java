package CoreJava;

public class Concrete_Class {
//Concrete Class means Complete Class
//It must contain only Concrete Methods().
//Abstract methods() are not allowed inside a Concrete Class.
	public static void test()
	{
		System.out.println(" Concrete Method test() Executed");
	}
	public static void trial()
	{
		System.out.println(" Concrete Method trial() Executed");
	}
	public static void main(String[] args) {
		System.out.println(" Concrete Method main() Started Executed");
		test();
		trial();
		System.out.println(" Concrete Method main() Ended Executed");
	}

}
