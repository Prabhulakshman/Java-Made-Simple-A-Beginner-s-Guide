package CoreJava;
//Concrete Super Class
//Is-a-Relationship (Inheritance) 
//We must and should Override every Abstract Methods() declared in Super Class in Sub Class.
public class Abstract_Class_SubClass extends Abstract_Class_Super{
@Override
public void test()
{
	System.out.println("Overridden Abstract Method - test() Executed");
}
@Override
public void sample()
{
	System.out.println("Overridden Abstract Method - sample() Executed");
}
@Override
public void demo()
{
	System.out.println("Overridden Abstract Method - demo() Executed");
}
	public static void main(String[] args) {
		System.out.println("Concrete main() method started");
		//Object of Sub Class
		Abstract_Class_SubClass r=new Abstract_Class_SubClass();
		r.test();
		r.sample();
		r.demo();
		
		System.out.println("Concrete main() method ended");

	}

}
