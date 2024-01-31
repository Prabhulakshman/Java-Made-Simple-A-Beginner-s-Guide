
public class Access_Modifier {
	//Access Modifier:
	//1.Static
	//2.Non-Static
public static void test()
{
	System.out.println("test() method is Running");
}
public void demo()
{
	System.out.println("demo() method is Running");
}
	public static void main(String[] args) {
		System.out.println("main() method is Running");
		//static methods can be accessed by giving its method name itself.
		test();
		//non-static methods can be accessed only by creating object and call the method with the help of reference variable.
		Access_Modifier r=new Access_Modifier();
		r.demo();

	}

}
