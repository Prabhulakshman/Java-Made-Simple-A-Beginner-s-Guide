
public class Method_Overloading {
	//Method Overloading Example
	public  void payment(int atm_no,short pin)
	{
		System.out.println("Payment through ATM Transaction Successfull");
		
	}
	public  void payment(String upi_id,int pin)
	{
		System.out.println("Payment through UPI Transaction Successfull");
		
	}
	
	public  void payment(int gpay_no,byte pin)
	{
		System.out.println("Payment through Google Pay Transaction Successfull");
		
	}
	public  void payment(long phn_pay_no,String password)
	{
		System.out.println("Payment through Phone Pay Transaction Successfull");
		
	}
	public void payment(String credit_card_no,int cvv,int pin)
	{
		System.out.println("Payment through Credit Card Transaction Successfull");
		
	}

	public static void main(String[] args) {
		System.out.println("main() method Started");
		Method_Overloading m1=new Method_Overloading();
		m1.payment(123456789, (short)123);
		m1.payment(987654321, (byte)123);
		m1.payment(9876543210l, "abc@123");
		m1.payment("Achu@123", 1250);
		m1.payment("LVB1245y678", 190, 9988);
		System.out.println("main() method Ended");

	}

}
