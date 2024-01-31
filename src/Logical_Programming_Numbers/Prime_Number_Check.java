package Logical_Programming_Numbers;
import java.util.Scanner;
public class Prime_Number_Check {
public static void check(int n)
{
	int count=0;
	if(n==0 || n==1)
	{
		System.out.println(n+" is Neither Prime nor Composite Number");
	}
	else
	{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	
	if(count==0)
	{
		System.out.println(n+" is a Prime Number");
	}
	else
	{
		System.out.println(n+" is not a Prime Number");
	}
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
