
public class Accessing_NonStatic_Members1 {

	public static void main(String[] args) {
		System.out.println("main() method is Running");
		//present in different class
		//object creation
		Accessing_NonStatic_Members ns1=new Accessing_NonStatic_Members();
		System.out.println(ns1.a);
		ns1.proto();

	}

}
