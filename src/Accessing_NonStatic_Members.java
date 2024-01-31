
public class Accessing_NonStatic_Members {
int a=15;
public void proto()
{
	System.out.println("proto() method is Running");
}
	public static void main(String[] args) {
		System.out.println("main() method is Running");
		//present in same class
		//object creation
		Accessing_NonStatic_Members ns=new Accessing_NonStatic_Members();
		System.out.println(ns.a);//accessing data member
		ns.proto();//accessing function member
		

	}

}
