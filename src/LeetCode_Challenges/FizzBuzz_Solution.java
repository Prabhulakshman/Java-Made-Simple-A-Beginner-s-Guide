package LeetCode_Challenges;
import java.util.Scanner;
import java.util.ArrayList;
public class FizzBuzz_Solution {
public static ArrayList<String> fizzbuzz(int n)
{
	
	ArrayList<String> l=new ArrayList<String>();
	for(int i=1;i<=n;i++)
	{
		
		//Print "FizzBuzz" for Multiples of Both 3 and 5
		 if(i%3==0 && i%5==0)
		{
			l.add("FizzBuzz");
		}
		//Print "Fizz" for Multiples of 3
		    else if(i%3==0)
			{
				l.add("Fizz");
			}
			//Print "Buzz" for Multiples of 5
			else if(i%5==0)
			{
				l.add( "Buzz");
			}
		//Prints the Integer Itself as String Format
		else
		{
			l.add(Integer.toString(i));
		}
	}
	return l;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter a Number: ");
		int n=s.nextInt();
		//ArrayList is used to Store a List of String 
		ArrayList<String> res=new ArrayList<String>();
				res=fizzbuzz(n);
				System.out.println(res);
		s.close();
		
	}

}
