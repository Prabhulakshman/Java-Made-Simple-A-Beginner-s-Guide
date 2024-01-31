package Logical_Programming_Numbers;
import java.util.Scanner;
public class Positive_or_Negative_Number {
public static void check(int n)
{
	String res= n>=0 ? "Positive Number":"Negative Number";
	System.out.println(res);
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=s.nextInt();
		check(n);
		s.close();
	}

}
