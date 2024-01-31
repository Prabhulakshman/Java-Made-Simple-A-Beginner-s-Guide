import java.util.Scanner;
public class Scanner_Short {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		short a=s.nextShort();
		System.out.println("Square of the Given Number is "+(a*a));
	}

}
