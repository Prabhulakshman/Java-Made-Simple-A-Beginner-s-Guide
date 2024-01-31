package CoreJava;
//Interface is a Type in Java.
//Interface does not have Constructor().
//In Interface by default all methods are Abstract Method() and all Variables are static and final.
//All Abstract methods() are public by default in Interfaces.
//We cannot able to create an Object for an Interface.
//Interface can support Concrete Static Methods().
//We can be able to create Reference Variable for Interface.

//Super Interface
public interface Interface_Sample {
	void test();
	public static void demo()
	{
		System.out.println("static Concrete method()");
	}
	public void sample();
	static final int a=10;
	int b=20;
	public static int sum()
	{
		int sum=a+b;
		return sum;
	}
	//Non Static Concrete methods () can be declared by using default Keyword in an Interface.
	default void test_case()
	{
		System.out.println("Non Static Concrete method()");
	}
		
}
