
public class Final_Variable {

	public static void main(String[] args) {

		int a=10;//Variable Declaration and Initialization
		int b;//Variable Declaration
		final int c=25;//Variable Declaration and Initialization
		b=a+a;//Variable Initialization
		System.out.println(b);
		b=a+c;//Variable Re-Initialization
		System.out.println(a);
		
		System.out.println(c);//Variable Re-Initialization is not Possible It is a Constant Variable.
		System.out.println(b);

	}

}
