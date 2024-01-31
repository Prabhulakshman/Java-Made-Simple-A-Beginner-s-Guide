package CoreJava;

public class Instanceof_Operator_Class_Solution {

	public static void main(String[] args) {
		Instanceof_Operator_Class_A a=new Instanceof_Operator_Class_A ();
		
		Instanceof_Operator_Class_B b=new Instanceof_Operator_Class_B ();
		
		Instanceof_Operator_Class_C c=new Instanceof_Operator_Class_C();
		//Super Class
		System.out.println(a instanceof Instanceof_Operator_Class_A );
		System.out.println(b instanceof Instanceof_Operator_Class_A );
		System.out.println(c instanceof Instanceof_Operator_Class_A );
		//Sub Class
		System.out.println(b instanceof Instanceof_Operator_Class_B );
		System.out.println(b instanceof Instanceof_Operator_Class_C );
		System.out.println(b instanceof Instanceof_Operator_Class_A );

	}

}
