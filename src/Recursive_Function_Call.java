
public class Recursive_Function_Call {
public static void sample(int n)
{
	
	System.out.println("Sample() Running");
	if(n<=5)
	{
	sample(n);
	}
	
	
}
	public static void main(String[] args) {
	
			sample(6);

	}

}
