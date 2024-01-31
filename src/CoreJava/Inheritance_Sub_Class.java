package CoreJava;

public class Inheritance_Sub_Class extends Inheritance_Sample{
	public void demo()
	{
		System.out.println("demo() method is running");
	}

	public static void main(String[] args) {
		System.out.println("main() method started");
		//Super Class Object
		Inheritance_Sample sup=new Inheritance_Sample();
		sup.test();//Only able to access super class properties
		//sup.demo();
		//Sub Class Object
		Inheritance_Sub_Class sub=new Inheritance_Sub_Class();
		sub.test();//We can able to access super class properties
		sub.demo();//We can able to access sub class properties
		System.out.println("main() method ended");

	}

}
