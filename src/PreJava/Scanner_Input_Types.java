package PreJava;
import java.util.Scanner;
public class Scanner_Input_Types {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter an Integer Value: ");
		int a=s.nextInt();
		System.out.println("Enter a Float Value: ");
		float b=s.nextFloat();
		System.out.println("Enter a Double Value: ");
		double c=s.nextDouble();
		System.out.println("Enter a Byte Value: ");
		byte d=s.nextByte();
		System.out.println("Enter a Short Value: ");
		short e=s.nextShort();
		System.out.println("Enter a Boolean Value: ");
		boolean f=s.nextBoolean();
		System.out.println("Enter a String Value: ");
		String g=s.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
