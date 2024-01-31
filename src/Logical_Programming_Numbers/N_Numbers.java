package Logical_Programming_Numbers;

import java.util.Scanner;
import java.util.Arrays;
public class N_Numbers {
public static int[]print_numbers(int start,int end)
{
	int arr[]=new int[end];
	for(int i=start;i<=end;i++)
	{
	     for(int j=0;j<arr.length;j++)
	     {
	    	 arr[j]=i;
	     }
	}
	return arr;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting Range: ");
		int start=s.nextInt();
		System.out.println("Enter Ending Range: ");
		int end=s.nextInt();
		int res[]=print_numbers(start,end);
		System.out.println(Arrays.toString(res));
		s.close();
	}

}
