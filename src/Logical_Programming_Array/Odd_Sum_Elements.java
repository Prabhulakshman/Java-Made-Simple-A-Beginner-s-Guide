package Logical_Programming_Array;

public class Odd_Sum_Elements {
public static int[] odd_sum(int arr[])
{
	
	int o_sum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			o_sum=o_sum+arr[i];
		}
	}
	System.out.println("The Sum of Odd Elements in a Given Array is: "+o_sum);
	return arr;
}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		odd_sum(a);
	}

}
