package Logical_Programming_Numbers;
import java.util.Scanner;
public class Spy_Number {
public static boolean spy(int num)
{
	int sum=0;
	int product=1;
	while(num>0)
	{
		int rem=num%10;
		sum=sum+rem;
		product=product*rem;
		num=num/10;
	}
	if(sum==product)
	{
		return true;
	}
	
	return false;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		boolean res=spy(num);
		if(res)
		{
			System.out.println(num+" is a Spy Number");
		}
		else
		{
			System.out.println(num+" is Not a Spy Number");
		}
		s.close();
	}

}
