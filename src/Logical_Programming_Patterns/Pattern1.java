package Logical_Programming_Patterns;
import java.util.Scanner;
public class Pattern1 {
public static void pattern(int rows)
{
	
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int rows=s.nextInt();
		pattern(rows);
		s.close();
		
	}

}
