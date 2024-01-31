package CoreJava;

public class Generalization_Specialization_Methods_Solution {

	public static void main(String[] args) {
		//Customer Object
		Generalization_Specialization_Methods_Sub c=new Generalization_Specialization_Methods_Sub();
		c.buy_product();
		
		//Employee Object
		Generalization_Specialization_Methods_Sub1 e=new Generalization_Specialization_Methods_Sub1();
		e.check_stocks();

	}

}
