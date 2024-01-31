package CoreJava;

public class Constructor_Demo {
	//Zero Argument Constructor(Default Constructor)
	public Constructor_Demo()
	{
		System.out.println("Zero Argument Constructor Executed");

	}
	//Parameterized Constructor
	public Constructor_Demo(int a)
	{
		System.out.println("Parameterized Constructor Executed");

	}

	public static void main(String[] args) {
		System.out.println("main() method is Running");
//Object Creation implicitly makes a Constructor() Call.
		Constructor_Demo r=new Constructor_Demo();
		
		
		Constructor_Demo re=new Constructor_Demo(10);
	}

}
//Rules for Constructor():
//1.It does not have a Return Type.
//2.Access Specifier cannot be declared as Static and Final.
