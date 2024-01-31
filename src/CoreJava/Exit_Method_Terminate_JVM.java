package CoreJava;

public class Exit_Method_Terminate_JVM {

	public static void main(String[] args) {
		int i=5;
	do {
		System.out.println("Iteration "+i+" times.");
		System.exit(0);//ClassName.member_name() to access static method
		//exit(0); It is used to terminate the current execution of JVM even condition satisfies true.
	}while(i>1);

	}

}
