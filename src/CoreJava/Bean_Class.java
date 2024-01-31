package CoreJava;
//Bean Class is also known as "POJO Class".
public class Bean_Class  {
	//Rule 1: Declaring Data Members as Private
	private String user_name;
	private int user_id;
	private String user_email;
	private long user_ph_no;
	//Initialize Data Members by using Constructors
	public Bean_Class(String user_name,int user_id,String user_email,long user_ph_no )
	{
		this.user_name=user_name;
		this.user_id=user_id;
		this.user_email=user_email;
		this.user_ph_no=user_ph_no;
	}
	
	//Rule 2: Access Data Members by using public getter() and setter() methods.
	//getter() methods:
	public String getuser_name()
	{
		return user_name;
	}
	public int getuser_id()
	{
		return user_id;
	}
	public String getuser_email()
	{
		return user_email;
	}
	public long getuser_ph_no()
	{
		return user_ph_no;
	}
	//setter() methods:
	public void setuser_name(String user_name)
	{
		this.user_name=user_name;
	}
	public void setuser_id(int user_id)
	{
		this.user_id=user_id;
	}

	public void setuser_email(String user_email)
	{
		this.user_email=user_email;
	}

	public void setuser_ph_no(long user_ph_no)
	{
		this.user_ph_no=user_ph_no;
	}

	public static void main(String[] args) {
		
		 Bean_Class b=new  Bean_Class ("Tom",10,"tom@gmail.com",9876543210l);
		 System.out.println("Before Changing Details: ");
		System.out.println( b.getuser_name());
		System.out.println( b.getuser_id());
		System.out.println(b.getuser_email());
		System.out.println( b.getuser_ph_no());
		 b.setuser_name("Jerry");
		 b.setuser_id(20);
		 b.setuser_email("jerry@yahoo.com");
		 b.setuser_ph_no(12349876528l);
		 System.out.println("After Changing Details: ");
			System.out.println( b.getuser_name());
			System.out.println( b.getuser_id());
			System.out.println(b.getuser_email());
			System.out.println( b.getuser_ph_no());
		 
	}

}
