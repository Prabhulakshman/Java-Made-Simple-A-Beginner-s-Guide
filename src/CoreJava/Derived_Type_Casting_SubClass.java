package CoreJava;
//Sub Class 
public class Derived_Type_Casting_SubClass extends Derived_Type_Casting{
	public  void demo() 
	{
		System.out.println("Sub Class Property");

	}

	public static void main(String[] args) {
	//Up casting
		Derived_Type_Casting p=new 	Derived_Type_Casting_SubClass();
		p.test();
	
		
	//Down Casting 
		Derived_Type_Casting_SubClass c= (Derived_Type_Casting_SubClass)p;//Casting Statement is Mandatory.
//For Down Casting Up casting is Mandatory.
		c.demo();
		c.test();
	}

}
