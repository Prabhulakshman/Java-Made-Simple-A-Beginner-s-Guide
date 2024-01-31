package Logical_Programming_Numbers;
import java.util.Scanner;
public class Perfect_Number {
public static boolean perfect(int num)
{
	int sum=0;
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
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
		boolean res=perfect(num);
		if(res)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
		{
			System.out.println(num+" is Not a Perfect Number");
		}
		s.close();
	}

}
