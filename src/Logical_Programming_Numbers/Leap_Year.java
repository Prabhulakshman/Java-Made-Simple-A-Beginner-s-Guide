package Logical_Programming_Numbers;
import java.util.Scanner;
public class Leap_Year {
public static boolean leap(int year)
{
	if((year%4==0 && year%100!=0 )|| year%400==0)
	{
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year=s.nextInt();
		boolean res=leap(year);
		if(res)
		{
			System.out.println(year+" is a Leap Year");
		}
		else
		{
			System.out.println(year+" is Not a Leap Year");
		}
		s.close();
	}

}
