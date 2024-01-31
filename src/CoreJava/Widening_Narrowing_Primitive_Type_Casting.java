package CoreJava;

public class Widening_Narrowing_Primitive_Type_Casting {
//Type Casting is generally classified into two types .They are,
	//1.Primitive Casting
	//2.Derived Casting
//Primitive Casting is further divided into two types .They are,
	//1.Widening
	//2.Narrowing
	public static void main(String[] args) {
		//1.Widening
		int a=10;
		double b=a;
		//2.Narrowing
		double x=10.5;
		int y=(int)x;//Casting Statement is Mandatory .
System.out.println(a);
System.out.println(b);
System.out.println(x);
System.out.println(y);

	}

}
