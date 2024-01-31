
public class Non_Static_Block {

	{
		System.out.println("Non-Static Block Executed");

	}
	public static void main(String[] args) {
	
		System.out.println("Main Method Executed");
        Non_Static_Block n=new Non_Static_Block();
	}

}
