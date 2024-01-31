package Logical_Programming_Strings;
import java.util.Scanner;
public class Vowels_Check {
public static int check(String str)
{
	int count=0;
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++)
	{
		char []vowel = {'a','e','i','o','u'};
		for(int j=0;j<vowel.length;j++) {
			if(str.charAt(i)==vowel[j])
			{
				count++;
			}
		}
	}
	return count;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=s.next();
		int res=check(str);
		System.out.println(str+" contains "+res+" Number of Vowel Characters");
		s.close();
	}

}
