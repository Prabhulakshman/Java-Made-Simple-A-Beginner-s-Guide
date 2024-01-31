package Logical_Programming_Numbers;
import java.util.Scanner;
public class Count_Number_Range {
public static int count_number(int start,int end,int key)
{
	int count=0;
	for(int i=start;i<=end;i++)
	{
		
	    if(i%10==key && i/10==key)
		{
			count+=2;
		}
	    else if(i%10==key)
		{
			count++;
		}
		else if (i/10==key)
		{
			count++;
		}
	}
	
	return count;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting Range: ");
		int start=s.nextInt();
		System.out.println("Enter Ending Range: ");
		int end=s.nextInt();
		System.out.println("Enter Key Number: ");
		int key=s.nextInt();
		int res=count_number(start,end,key);
		System.out.println(res+" Number of Times "+key+" found in a Given Range");
		s.close();
	}

}
