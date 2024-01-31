package Logical_Programming_Numbers;

import java.util.Scanner;

public class Product_of_Numbers_in_a_Digit {
	public static int product(int num)
	{
		int product=1;
		while(num>0)
		{
		int rem=num%10;
		product=product*rem;
		num=num/10;
		}
		return product;
	}
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		int res=product(num);
		System.out.println("Product of Numbers in a Digit is "+res);
		s.close();
	}
}
