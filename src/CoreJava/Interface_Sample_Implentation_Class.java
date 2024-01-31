package CoreJava;
//Implementation Class
public class Interface_Sample_Implentation_Class implements Interface_Sample{
@Override
public void test()
{
	System.out.println("non static abstract test method()");
}
@Override
public void sample()

{
	System.out.println("non static abstract sample method()");
	
}

	public static void main(String[] args) {

		//Implementation Class Object
		Interface_Sample_Implentation_Class r=new Interface_Sample_Implentation_Class();
		//Non Static Abstract methods can be accessed with the help of Reference Variable.
		r.test();
		r.sample();
		//Static Concrete methods can be accessed with Class Name.member name();
		Interface_Sample.demo();
		System.out.println(Interface_Sample.sum());
		//Non Static Concrete methods can be accessed with the help of Reference Variable.
		r.test_case();

	}

}
