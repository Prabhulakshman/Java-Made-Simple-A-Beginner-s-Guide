
public class Sequential_Function_Call {
public static void test() 
{
	System.out.println("test() running");
	
}
public static void test1() 
{
	System.out.println("test1() running");
	test();
}
public static void test2() 
{
	System.out.println("test2() running");
	test1();
	
}
public static void test3() 
{
	System.out.println("test3() running");
	test2();
	
}
	public static void main(String[] args) {
		test3();

	}

}
