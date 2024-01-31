package Logical_Programming_Array;
public class Even_Sum_Elements {
	public static int[] even_sum(int arr[])
	{
		int e_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2==0)
			{
				e_sum=e_sum+arr[i];
			}
		}
		System.out.println("The Sum of Even Elements in a Given Array: "+e_sum);
		return arr;
	}
public static void main(String[]args)
{
	int a[]= {1,2,3,4,5,6,7,8,9};
	even_sum(a);
}
}