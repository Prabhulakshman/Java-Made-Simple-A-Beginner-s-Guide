package Logical_Programming_Numbers;
import java.util.Scanner;
public class Natural_Number_Series {
public static void natural(int n)
{
	for(int i=1;i<=n;i++)
	{
		System.out.print(i+" ");
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=s.nextInt();
		natural(n);
		s.close();
	}

}
