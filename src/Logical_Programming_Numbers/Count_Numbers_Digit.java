package Logical_Programming_Numbers;
import java.util.Scanner;
public class Count_Numbers_Digit {
public static int count(int num)
{
	int count=0;
	while(num>0)
	{
	int rem=num%10;
	count++;
	num=num/10;
	}
	return count;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		int res=count(num);
		System.out.println(num+" digit contains "+res+" numbers");
		s.close();
	}

}
