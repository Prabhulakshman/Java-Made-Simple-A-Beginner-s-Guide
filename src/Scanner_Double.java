import java.util.Scanner;
public class Scanner_Double {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a Number: ");
		double a=s.nextDouble();
		System.out.println("Square of the Given Number is "+(a*a));
		s.close();
	}

}
