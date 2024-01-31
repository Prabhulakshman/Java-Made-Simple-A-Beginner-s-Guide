package CoreJava;

public class Generalization_Specialization_Methods_Super {
//Generalization: Declaring common method and variables in a super class and it can be used by all of it's sub classes.	
	//Generalized Method: Login()
	//Consider login() method is common for both Amazon Customers and Employees.
	public void login(String user_name,String password)
	{
		if(user_name.equals("abc") && password=="123@")
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login Un-Successfull");
		}
	}
}
