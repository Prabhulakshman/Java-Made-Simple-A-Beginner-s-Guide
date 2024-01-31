package Logical_Programming_Numbers;
import java.util.Scanner;
public class Palindrome_Number {
public static boolean check_Number(int num)
{
	int org=num;
	int rev=0;
	while(num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(org==rev)
	{
	return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		boolean res=check_Number(num);
		if(res)
		{
			System.out.println(num+" is a Palindrome Number");
			
		}
		else
		{
			System.out.println(num+" is Not a Palindrome Number");	
		}
		s.close();
	}

}
