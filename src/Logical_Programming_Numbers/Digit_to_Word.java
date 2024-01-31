package Logical_Programming_Numbers;
import java.util.Scanner;
public class Digit_to_Word {
public static void digit_to_word(int d)
{
	switch (d)
	{
	case 0:
	{
		System.out.println( "Zero");
		break;
	}
	case 1:
	{
		System.out.println("One");
		break;
	}
	
	case 2:
	{
		System.out.println("Two");
		break;
	}
	
	case 3:
	{
		System.out.println( "Three");
		break;
	}
	
	case 4:
	{
		System.out.println( "Four");
		break;
	}
	
	case 5:
	{
		System.out.println("Five");
		break;
	}
	
	case 6:
	{
		System.out.println("Six");
		break;
	}
	
	case 7:
	{
		System.out.println("Seven");
		break;
	}
	
	case 8:
	{
		System.out.println("Eight");
		break;
	}
	case 9:
	{
		System.out.println("Nine");
		break;
	}
	default:
	{
		System.out.println( "Invalid Digit");
	}	
	}
	

}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int d=s.nextInt();
		digit_to_word(d);
		s.close();
	}

}
