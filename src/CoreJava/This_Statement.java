package CoreJava;
//this() calling statement is used to achieve Local Constructor Chaining.
public class This_Statement {
public This_Statement()
{
	System.out.println("Zero Argument Constructor() Executed");

}
public This_Statement(int a)
{
	this();
	System.out.println("Parameterized Integer Type Constructor() Executed");
}

public This_Statement(double a)
{
	this(12);
	System.out.println("Parameterized Double Type Constructor() Executed");

}

public This_Statement(float a)
{
	this(12.99);
	System.out.println("Parameterized Float Type Constructor() Executed");

}
public This_Statement(byte a)
{
	this(1.2f);
	System.out.println("Paramtereized Byte Type Constructor() Executed");

}

public This_Statement(short a)
{
	this(12);
	System.out.println("Parameterized Short Type Constructor() Executed");

}

public This_Statement(long a)
{
	this(1);
	System.out.println("Parameterized Long Type Constructor() Executed");

}

public This_Statement(boolean a)
{
	this(12345678901234l);
	System.out.println("Parameyterized Boolean Type Constructor() Executed");

}


	public static void main(String[] args) {
		 This_Statement t=new  This_Statement(true);

	}

}
