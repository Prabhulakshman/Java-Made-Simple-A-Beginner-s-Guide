
public class Function_Call_Same_Class1 {
//non static chain function call present in same class
	public  void main() {
		System.out.println("User Defined main() method is Running");

	}
	public  void test() {
		System.out.println("test() method is Running");
		main();

	}
	public  void run() {
		System.out.println("run() method is Running");
		test();

	}
	public static void main(String[] args) {
		System.out.println("Pre Defined main() method is Running");
		new Function_Call_Same_Class1().run();

	}

}
