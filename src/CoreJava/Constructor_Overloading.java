package CoreJava;
//Constructor Overloading Example Program
public class Constructor_Overloading {
	//Access Specifier: public
public Constructor_Overloading()
{
	System.out.println("Zero Argument Constructor() Executed");
}
//Access Specifier: protected
protected Constructor_Overloading(int a)
{
	System.out.println("Parameterized Integer Type Constructor() Executed");
}
//Access Specifier: private
private Constructor_Overloading(double b)
{
	System.out.println("Parameterized Double Type Constructor() Executed");
}
//Access Specifier: package-level(Default)
 Constructor_Overloading(int a,double b)
{
	System.out.println("Parameterized Integer and Double Type Constructor() Executed");
}
 public Constructor_Overloading(double a,int b)
 {
 	System.out.println("Parameterized Double and Integer Type Constructor() Executed");
 }
	public static void main(String[] args) {
		System.out.println("main() method Started");
		Constructor_Overloading c1=new Constructor_Overloading();
		Constructor_Overloading c2=new Constructor_Overloading(10);
		Constructor_Overloading c3=new Constructor_Overloading(10.0);
		Constructor_Overloading c4=new Constructor_Overloading(10,12.5);
		Constructor_Overloading c5=new Constructor_Overloading(100.50,123);
		
		
		System.out.println("main() method Ended");
	}

}
