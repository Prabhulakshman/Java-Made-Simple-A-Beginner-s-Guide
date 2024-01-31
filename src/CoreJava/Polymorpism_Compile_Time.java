package CoreJava;
//Polymorphism is a method showing different behaviour's at different places.
//Polymorphism is classified into two types.They are,
	//1.Compile Time Polymorphism- Early Binding or Static binding
	//2.Run Time Polymorphism-Non Static Binding or Dynamic Binding


public class Polymorpism_Compile_Time {
//Compile Time - Binding of method declaration and method definition by the Compiler before Execution.
	//Examples- Method Over loading and Constructor Over loading.
	//Constructor Over Loading
			public Polymorpism_Compile_Time()
			{
				System.out.println("Constructor");
			}
			public Polymorpism_Compile_Time(int a)
			{
				System.out.println("Over Loaded Constructor");
			}
			public void test()
			{
				System.out.println("Method");
			}
			public void test(int a)
			{
				System.out.println("Over Loaded Method");
			}
	public static void main(String[] args) {
		Polymorpism_Compile_Time c=new Polymorpism_Compile_Time();
		c.test();
		Polymorpism_Compile_Time c1=new Polymorpism_Compile_Time(10);
		c.test(10);
		

	}

}
