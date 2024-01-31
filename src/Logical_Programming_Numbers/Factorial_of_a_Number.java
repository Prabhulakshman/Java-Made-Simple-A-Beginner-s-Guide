package Logical_Programming_Numbers;
import java.util.Scanner;
public class Factorial_of_a_Number {
	public static void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a Given Number is "+fact);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=s.nextInt();
		fact(n);
		s.close();
	}

}
