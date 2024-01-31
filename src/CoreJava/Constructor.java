package CoreJava;

public class Constructor {
public  Constructor ()
{
	System.out.println("Constructor() Executed ");
}
	public static void main(String[] args) {
		System.out.println("main() Started");
		new Constructor();
	}

}
