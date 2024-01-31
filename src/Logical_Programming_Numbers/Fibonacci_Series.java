package Logical_Programming_Numbers;
import java.util.Scanner;
public class Fibonacci_Series {
public static void fibo(int n)
{
	int n1=0;
	int n2=1;
	System.out.println(n1);
	System.out.println(n2);
	for (int i=2;i<n;i++)
	{
	int n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=s.nextInt();
		fibo(n);
		s.close();
	}

}
