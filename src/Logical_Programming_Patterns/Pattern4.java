package Logical_Programming_Patterns;
import java.util.Scanner;
public class Pattern4 {
	public static void pattern(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				if(j==rows || j==(rows-(rows-1)) ||i==1 || j==1 || i==rows)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of Rows: ");
		int rows=s.nextInt();
		pattern(rows);
		s.close();
	}

}
