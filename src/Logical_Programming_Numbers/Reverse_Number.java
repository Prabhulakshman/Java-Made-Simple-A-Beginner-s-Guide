package Logical_Programming_Numbers;

import java.util.Scanner;

public class Reverse_Number {
public static int rev_num(int num)
{
	int rev=0;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	return rev;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		int res=rev_num(num);
		System.out.println("Reverse Number is "+res);
		s.close();
		
	}

}
