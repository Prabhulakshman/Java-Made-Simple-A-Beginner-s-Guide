package CoreJava;

public class Login_Encapsulation {

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation("Jim","jimmy#357");
		System.out.println("Before Modification Login Details: ");
		System.out.println(e.getuser_name());
		System.out.println(e.getpassword());
		//Doing some Modifications
		e.setuser_name("Miller");
	    e.setpassword("millerandy@0851");
	    System.out.println("After Modification Login Details: ");
		System.out.println(e.getuser_name());
		System.out.println(e.getpassword());
		

	}

}
