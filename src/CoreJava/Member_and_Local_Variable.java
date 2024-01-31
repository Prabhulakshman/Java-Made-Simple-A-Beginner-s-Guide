package CoreJava;

public class Member_and_Local_Variable {
static int a=100;
int b=20;
int c;
public static void demo()
{
	int a=10;
	int g=7;
	System.out.println(a);
	System.out.println(g);
	System.out.println(Member_and_Local_Variable.a*a);
	
}
	public static void main(String[] args) {
		System.out.println(a);
		demo();
		Member_and_Local_Variable ref =new Member_and_Local_Variable();
		
		System.out.println(ref.b);
		System.out.println(ref.c);

	}

}
