
public class Instance_Variable {
//Instance Variable is also known as Non-Static Member Variable
	int i=1000;
	void display()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		Instance_Variable r=new Instance_Variable();
         r.display();

	}

}
