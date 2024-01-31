
public class Function_Members {
	public void test()
	{
		System.out.println("test() method is Running");
	}
public static void demo()
{
	System.out.println("demo() method is Running");
}
	public static void main(String[] args) {
		
		System.out.println("main() method is Running");
		demo();
		Function_Members f=new Function_Members();
		f.test();
	}

}
