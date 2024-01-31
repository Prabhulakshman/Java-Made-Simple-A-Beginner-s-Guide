package Logical_Programming_Numbers;
import java.util.Scanner;
public class Whole_Number_Series {
public static void whole(int n)
{
	for(int i=0;i<=n;i++)
	{
		System.out.print(i+" ");
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=s.nextInt();
		whole(n);
		s.close();
	}

}
