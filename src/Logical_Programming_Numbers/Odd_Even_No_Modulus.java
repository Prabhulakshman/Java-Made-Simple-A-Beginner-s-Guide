package Logical_Programming_Numbers;

import java.util.Scanner;

public class Odd_Even_No_Modulus {
public static boolean checker(int num)
{
	if((num/2)*2 ==num)
	{
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		boolean res=checker(num);
		if(res)
		{
			System.out.println(num+" is an Even Number");
		}
		else
		{
			System.out.println(num+" is an Odd Number");
		}
		s.close();
	}

}
