package Logical_Programming_Strings;
import java.util.Scanner;
public class Palindrome {
public static boolean check(String str)
{
	String org=str.toLowerCase();
	String rev="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		rev=rev+ch;
	}
	if(org.equals(rev.toLowerCase()))
	{
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=s.nextLine();
		boolean res=check(str);
		if(res)
		{
			System.out.println(str+" is a Palindrome");
		}
		else
		{
			System.out.println(str+" is Not a Palindrome");
		}
		s.close();
	}

}
