package CoreJava;

public class Class_Members {
//Data Members
	static int x=10;
	 static double y=25.5;
	//Function Members
	public static void show()
	{
		System.out.println(x);
		System.out.println(Class_Members.y);//To access member variable inside method: Class_Name.member_name;
	}
	public static void main(String[] args) {
		show();

	}

}
