package CoreJava;

public class Single_Inheritance_Asset_Handover {

	public static void main(String[] args) {
		// Super Class Object 
		Single_Inheritance_Father sup=new Single_Inheritance_Father();
		sup.bike();
		sup.car();
		sup.home();
		System.out.println(sup.bank_balance);
		
		//Sub Class Object
		 Single_Inheritance_Child sub=new  Single_Inheritance_Child();
		 sub.cycle();
		 sub.bike();
			sub.car();
			sub.home();
			System.out.println(sub.bank_balance);
			System.out.println(sub.credit_amount);
	}

}
