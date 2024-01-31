package CoreJava;
//Wrapping of Data Members as a Single Entity is called as Encapsulation.
//It is achieved by using Bean Class or POJO Class.
public class Encapsulation {
	
	//Declaring Data Members as Private
	
	private String user_name;
	private String password;
	
	//Initializing Data Members using Constructor()
	
	public Encapsulation(String user_name,String password)
	{
		this.user_name=user_name;
		this.password=password;
	}
	
	//getter() methods:
	
	public String getuser_name()
	{
		return user_name;
	}
	public String getpassword()
	{
		return password;
	}
	
	//setter() methods:
	
	public  void setuser_name(String user_name)
	{
		this.user_name=user_name;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}

}

