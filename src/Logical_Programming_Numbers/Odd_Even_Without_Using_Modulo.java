package Logical_Programming_Numbers;

import java.util.Scanner;

public class Odd_Even_Without_Using_Modulo {
public static int check(int num)
{
	return( num&1);
		
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		int res=check(num);
		if(res==1)
		{
			System.out.println(num+" is an Odd Number");
		}
		else
		{
			System.out.println(num+" is an Even Number");
		}
		s.close();
	}

}
