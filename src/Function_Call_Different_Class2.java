
public class Function_Call_Different_Class2 {
	//non static chain function call present in different class

	public static void main(String[] args) {
		System.out.println("Pre Defined main() method is Running");
		String [] s1=new String [5];
		new Function_Call_Same_Class1().main(s1);

	}

}
