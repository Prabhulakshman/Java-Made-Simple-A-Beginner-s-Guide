package CoreJava;

public class Access_Specifiers {
public static void test()
{
	System.out.println("test() is Running");
}
protected static void sample()
{
	System.out.println("sample() is Running");
}
private static void demo()
{
	System.out.println("demo() is Running");
}
 static void run()
{
	System.out.println("run() is Running");
}
public static void main(String[]args)
{
	System.out.println("main() is Running");
	test();
	sample();
	demo();
	run();
}

}
