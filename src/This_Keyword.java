
public class This_Keyword {
	int a, b;
	public  This_Keyword(int a,int b)
	{
		//this keyword is used to differentiate member variable and local variable
		this.a=a;//this.member_variable=local_variable;
		this.b=b;//this.member_variable=local_variable;
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		System.out.println("main() started");
		This_Keyword t=new This_Keyword(1,2);
		System.out.println("main() ended");
		This_Keyword t1=new This_Keyword(3,4);

	}

}
