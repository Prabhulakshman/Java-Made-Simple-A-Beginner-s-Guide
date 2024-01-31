import java.util.Scanner;
public class Scanner_Character {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char c=s.next().charAt(0);
		System.out.println("ASCII Value of Given Character "+c+" is "+(int)c);
	}

}
