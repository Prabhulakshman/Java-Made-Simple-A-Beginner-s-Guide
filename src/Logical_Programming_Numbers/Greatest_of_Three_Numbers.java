package Logical_Programming_Numbers;
import java.util.Scanner;
public class Greatest_of_Three_Numbers {
public static void greatest_number(int a,int b,int c)
{
	int max_num=(a>b) &&( a>c )? a:(b>c) ? b:c;
		System.out.println("Greatest Number among Three Numbers is "+max_num);
}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Value of a :");
		int a=s.nextInt();
		System.out.println("Enter the Value of b :");
		int b=s.nextInt();
		System.out.println("Enter the Value of c :");
		int c=s.nextInt();
		greatest_number(a,b,c);
		s.close();
	}

}
