package Logical_Programming_Patterns;
import java.util.Scanner;
public class Pattern2 {
	public static void pattern(int rows)
	{
		for(int i=0;i<=rows;i++)
		{
			for(int j=i;j<rows;j++)
			{
				System.out.print("*");
			}
			System.out.println();		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int rows=s.nextInt();
		pattern(rows);
		s.close();
	}

}
