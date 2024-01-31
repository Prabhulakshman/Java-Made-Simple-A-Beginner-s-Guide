package Logical_Programming_Numbers;
import java.util.Scanner;
public class Count_Number_Between_Range {
public static int count_num(int start, int end)
{
	int count=0;
	for(int i=start;i<=end;i++)
	{
		count++;
	}
	return count;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting Range: ");
		int start=s.nextInt();
		System.out.println("Enter Ending Range: ");
		int end=s.nextInt();	
		int res=count_num(start,end);
		System.out.println("There are "+res+" Numbers in a Given Range ");
		s.close();
	}

}
