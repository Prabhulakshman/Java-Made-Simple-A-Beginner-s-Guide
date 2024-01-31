package Logical_Programming_Numbers;
import java.util.Scanner;
public class Neon_Number {
public static boolean neon(int num)
{
	int square=num*num;
	int sum=0;
	while(square>0)
	{
		int rem=square%10;
		sum=sum+rem;
		square=square/10;
	}
	if(sum==num)
	{
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		boolean res=neon(num);
		if(res)
		{
			System.out.println(num+" is a Neon Number");
		}
		else
		{
			System.out.println(num+" is Not a Neon Number");
		}
		s.close();
	}

}
