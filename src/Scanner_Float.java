import java.util.Scanner;
public class Scanner_Float {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		float a=s.nextFloat();
		System.out.println("Square of the Given Number is "+(a*a));
	}

}
