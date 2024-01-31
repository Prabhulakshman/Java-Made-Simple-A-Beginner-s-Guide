
public class Overloading_Main_Method {
	public static void main(int[] args) {
		System.out.println("User Defined main() method is Running");

	}

	public static void main() {
		System.out.println("User Defined 2 main() method is Running");
		int[]a1= {1,2,3,4,5};
        main(a1);
	}

	public static void main(String[] args) {
		System.out.println("Pre Defined main() method is Running");
		main();
		

	}

}
