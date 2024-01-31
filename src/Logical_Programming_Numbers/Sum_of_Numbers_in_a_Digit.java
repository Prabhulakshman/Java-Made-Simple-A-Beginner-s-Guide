package Logical_Programming_Numbers;
import java.util.Scanner;
public class Sum_of_Numbers_in_a_Digit {
	public static int sum(int num)
	{
		int sum=0;
		while(num>0)
		{
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		int res=sum(num);
		System.out.println("Sum of Numbers in a Digit is "+res);
		s.close();
	}

}
