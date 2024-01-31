package Logical_Programming_Numbers;
import java.util.Scanner;
public class Reverse_Multiples {
public static void rev_multiple(int num)
{
	System.out.println("Reverse Muliples of "+num);
	for(int i=10;i>=1;i--)
	{
		System.out.println(num+"*"+i+"="+num*i);
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=s.nextInt();
		rev_multiple(num);
		s.close();
	}

}
