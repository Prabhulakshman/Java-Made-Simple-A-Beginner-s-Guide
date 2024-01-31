package CoreJava;
//Sub Class
public class Polymorphism_Run_Time_SubClass extends Polymorphism_Run_Time_Super{
@Override
public void test()
{
	System.out.println("Overridden Method");
}
@Override
public void demo()
{
	System.out.println("Overridden Method");
}
	public static void main(String[] args) {
		Polymorphism_Run_Time_SubClass sub=new Polymorphism_Run_Time_SubClass();
		sub.test();
		sub.demo();

	}

}
