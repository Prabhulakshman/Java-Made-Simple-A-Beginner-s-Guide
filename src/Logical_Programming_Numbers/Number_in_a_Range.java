package Logical_Programming_Numbers;

import java.util.Scanner;

public class Number_in_a_Range {
public static void num_count(int num,int start,int end)
{
	int count=0;
	for(int i=start;i<=end;i++)
	{
		if(i%10==num ||i%100==num )
		{
			count++;
		}
		if(i/10==num || i/100==num )
		{
			count++;
		}
	}
	System.out.println(num+" is Repeated "+count+" Number of Times within a Given Range");
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting Range: ");
		int start=s.nextInt();
		System.out.println("Enter Ending Range: ");
		int end=s.nextInt();
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		num_count(num,start,end);
		s.close();
	}

}
