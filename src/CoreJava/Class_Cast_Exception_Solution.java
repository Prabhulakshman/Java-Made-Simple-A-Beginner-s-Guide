package CoreJava;

public class Class_Cast_Exception_Solution {

	public static void main(String[] args) {
		Class_Cast_Exception_Super p=new Class_Cast_Exception_SubClass1();
		
		Class_Cast_Exception_SubClass1 c1=(Class_Cast_Exception_SubClass1)p;
		c1.test();
		c1.demo();
//Class_Cast_Exception_SubClass2 c2=(Class_Cast_Exception_SubClass2)p;
		//class CoreJava.Class_Cast_Exception_SubClass1 cannot be cast to class.

	}

}
