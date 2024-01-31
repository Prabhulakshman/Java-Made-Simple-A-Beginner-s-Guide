package Logical_Programming_Numbers;
import java.util.Scanner;
public class Odd_or_Even_Check {
	public static void check(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+" is an Even Number");
		}
		else
		{
			System.out.println(n+" is an Odd Number");
		}
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=s.nextInt();
		check(n);
		s.close();
	}

}
