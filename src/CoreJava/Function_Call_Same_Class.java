package CoreJava;

public class Function_Call_Same_Class {
	//present in same class static chain function call
	public static void sample() {
		System.out.println("sample() method is Running");

	}
	public static void demo() {

		System.out.println("demo() method is Running");
		sample();
	}
	public static void test() {
		System.out.println("test() method is Running");
demo();
	}
	public static void run() {
		System.out.println("run() method is Running");
		test();
	}
	public static void main(String[] args) {

		System.out.println("main() method is Running");
		run();
	}

}
