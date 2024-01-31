import java.util.Scanner;
public class Scanner_String {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str=s.nextLine();
	System.out.println("Length of the Given String is "+str.length());
	System.out.println(str);
	}

}
