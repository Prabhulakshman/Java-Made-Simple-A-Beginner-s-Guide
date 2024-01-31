package CoreJava;

public class Constructor_Example {
	//Student Login - Constructor
	int sid;
	String s_name;
	String s_email;
	String password;
	long ph_no;
	public Constructor_Example(int sid,String s_name,String s_email,String password,long ph_no)
	{
		this.sid=sid;
		this.s_name=s_name;
		this.s_email=s_email;
		this.password=password;
		this.ph_no=ph_no;
	}
	public void Student_Details()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("Student Details: ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Student Id: "+sid);
		System.out.println("Student Name: "+s_name);
		System.out.println("Student Emailo: "+s_email);
		System.out.println("Password: "+password);
		System.out.println("Phone Number: "+ph_no);
		System.out.println("-----------------------------------------------------");
		
	}

	public static void main(String[] args) {
		Constructor_Example s1=new Constructor_Example(101,"Tom","tom@gmail.com","abc@123",12345678);
	s1.Student_Details();
	Constructor_Example s2=new Constructor_Example(101,"Jerry","jerry@gmail.com","jerry@123",567891234);
	s2.Student_Details();


	}

}
