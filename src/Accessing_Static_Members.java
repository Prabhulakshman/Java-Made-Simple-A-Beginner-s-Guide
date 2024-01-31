
public class Accessing_Static_Members {
static int a=100;
public static void sample()
{
	System.out.println("sample() is Running");
}
	public static void main(String[] args) {
		System.out.println("main() is Running");
		//present in same class
		System.out.println(a);//accessing data members
		sample();//accessing function members
	}

}
