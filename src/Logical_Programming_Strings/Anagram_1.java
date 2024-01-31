package Logical_Programming_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_1 {
	public static boolean check(String str1, String str2)
	{
		char c1[]=str1.toLowerCase().replace(" ", "").toCharArray();
		char c2[]=str2.toLowerCase().replace(" ","").toCharArray();
		if(c1.length != c2.length)
		{
			return false;
		}
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			for(int i=0;i<c1.length;i++)
			{
				for(int j=0;j<c2.length;j++)
				{
					if(c1[i]==c2[j])
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1=s.nextLine();
		System.out.println("Enter String 2: ");
		String str2=s.nextLine();
		boolean res=check(str1,str2);
		if(res)
		{
			System.out.println(str1+" and "+str2+" is an Anagram");
		}
		else
		{
			System.out.println(str1+" and "+str2+" is Not an Anagram");
		}
		s.close();
		
	}

}
