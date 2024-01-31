package Logical_Programming_Numbers;
import java.util.Scanner;
public class Odd_Numbers_Series {
	public static void odd_series(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=s.nextInt();
		odd_series(n);
		s.close();

	}

}
