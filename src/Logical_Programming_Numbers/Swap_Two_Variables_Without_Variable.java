package Logical_Programming_Numbers;
import java.util.Scanner;
public class Swap_Two_Variables_Without_Variable {
public static void swap(int a,int b)
{
	System.out.println("Before Swapping Value of a is :"+a);
	System.out.println("Before Swapping Value of b is :"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping Value of a is :"+a);
	System.out.println("After Swapping Value of b is :"+b);
	
}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The Value of a: ");
		int a=s.nextInt();
		System.out.println("Enter The Value of b: ");
		int b=s.nextInt();
		swap(a,b);
		s.close();
	}

}
