package CoreJava;
//Abstract Class means an Incomplete Class.
//a Class declared with an 'Abstract' Keyword is called as Abstract Class.
//If a Class contains at least one Abstract Method then the Class should be declared as Abstract Class.
//Concrete Methods are also allowed in an Abstract Class.
//We can create Reference Variable only for an Abstract Class.
//We cannot be able to create an Object for an Abstract Class.
//Abstract Methods() cannot be declared as static, final ,private.
//Abstract Class contains constructor().
public abstract class Abstract_Class {
	//Concrete Method()-a method() which contains both method declaration and method definition also.
	public static void test()
	{
		System.out.println(" Concrete Method test() Executed");
	}
	public static void trial()
	{
		System.out.println(" Concrete Method trial() Executed");
	}
	//Abstract Method() - a method() which only contains method() declaration.
	abstract public  void sample();
	
	public static void main(String[] args) {
		Abstract_Class r;//Reference Variable
		//Abstract_Class r=new Abstract_Class();
         test();
         trial();
	}

}
