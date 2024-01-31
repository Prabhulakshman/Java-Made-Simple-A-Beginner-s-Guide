package CoreJava;
//Sub Class
public class Method_Overriding_SubClass extends Method_Overriding_Super{
@Override//Annotation Override - It is not a mandatory but Good to use.
public  void demo()//method() declaration same but method() definition changes.
{
	System.out.println("Overridden demo() executed");
}
//static , private , final methods () cannot be overridden

	public static void main(String[] args) {
		System.out.println("main() method started");
		//Object Creation
		Method_Overriding_Super m=new Method_Overriding_Super();
		m.demo();
		m.test();
		m.nothing();
		test();
		//sample(); Error-The method sample() from the type Method_Overriding_Super is not visible
		System.out.println("main() method ended" );

		
	}

}
