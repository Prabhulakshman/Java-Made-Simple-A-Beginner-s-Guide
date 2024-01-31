import java.util.Scanner;
public class Scanner_Byte {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		byte a=s.nextByte();
		System.out.println("Square of the Given Number is "+(a*a));
	}

}
