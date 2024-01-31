
public class Variable_Types {
	
	int x=100;//Non-Static Primitive Member Variable
	final float pi=3.14f;//Final Non-Static Primitive Member Variable
	static int y=150;//Static Primitive Member  Variable
	static int a=199;
	Variable_Types ref=new Variable_Types();//Non-Static Reference Member Variable
	static Variable_Types r1;//Static Reference Member  Variable
	
	
	
	public static void test()
	{
		int a=10;//Local Primitive Variable 
		Variable_Types r;//Local Reference Variable
		System.out.println(a);
		System.out.println(Variable_Types.a);
		
		
		
	}

	public static void main(String[] args) {

		System.out.println("Pre Defined main() method is Running");
		test();
		
		System.out.println(y);
		System.out.println(r1);
	}

}
