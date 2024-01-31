package CoreJava;
//Overloading main() is Possible but We cannot Modify the Original Pre-Defined main() method where the Execution actually Starts.
public class Main_Method_Overloading {
	public static void main() {
		System.out.println("User Defined Zero Argument  main() method");

	}
	public static void main(int[] args) {
		System.out.println("User Defined Parameterized Integer Type main() method");
		main();

	}
	public static void main(String[] args) {
		System.out.println("Original main() method");
		int[] a= {1,2,3,4};
		main(a);

	}

}
